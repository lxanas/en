package com.example.en.controller;

import com.example.en.result.Result;
import com.example.en.pojo.User;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

//根据结果返回不同的 Result，即不同的响应码。前端如果接收到成功的响应码（200），则跳转到 /index 页面

@RestController
public class LoginController {
    @CrossOrigin
    @RequestMapping("api/login")
    public Result login(@RequestBody User user) {
        String username = HtmlUtils.htmlEscape(user.getUsername());
        if (!"admin".equals(username) || !"123456".equals(user.getPassword())) {
            String message="password error";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
