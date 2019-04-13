package com.etoak.service.impl;

import com.etoak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class ThreadServiceImpl extends Thread{
    @Override
    public void run(){
        try {
            UserServiceImpl userService=new UserServiceImpl();
            userService.testThread("Thread");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
