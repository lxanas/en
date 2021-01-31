package com.example.en.error;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

//默认的错误页面设置为 /index.html

@Component
public class ErrorConfig implements ErrorPageRegistrar
{

    @Override
    public void registerErrorPages(ErrorPageRegistry registry)
    {
        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/index.html");
        registry.addErrorPages(error404Page);
    }

}
