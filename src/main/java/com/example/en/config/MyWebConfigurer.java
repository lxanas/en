package com.example.en.config;

import com.example.en.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer
{

    @Bean
    public LoginInterceptor getLoginIntercepter()
    {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        //对所有路径应用拦截器，index.html除外
        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/file/**").addResourceLocations("file:" + "d:/workspace/img/");
    }
}
