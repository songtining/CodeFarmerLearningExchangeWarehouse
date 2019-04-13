package com.etoak.controller;

import com.alibaba.fastjson.JSONObject;
import com.etoak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/checkUserName")
    @ResponseBody
    public String checkUserName(HttpServletRequest request, HttpServletResponse response,String username,String password){
        System.out.println("用户名"+username+"----密码"+password);
        JSONObject jsonObject=userService.checkUserName(username,password);
        return jsonObject.toString();
    }
    @RequestMapping("/login")
    public String getUserName(HttpServletRequest request, HttpServletResponse response,String username,String password){
        System.out.println("登录成功~~~");
        return "/index";
    }
}
