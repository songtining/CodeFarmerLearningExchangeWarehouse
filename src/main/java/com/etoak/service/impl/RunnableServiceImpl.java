package com.etoak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

public class RunnableServiceImpl implements Runnable  {
    public void run(){
        UserServiceImpl userService=new UserServiceImpl();
        userService.testThread("Runnable");
    }
}
