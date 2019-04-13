package com.etoak.controller;

import com.etoak.pojo.User;
import com.etoak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/Test")
public class TestController {
   @Autowired
    private UserService userService;
    @RequestMapping("/getUserName")
    public String getUserName(HttpServletRequest request, HttpServletResponse response){
        return "/login";
    }
}
