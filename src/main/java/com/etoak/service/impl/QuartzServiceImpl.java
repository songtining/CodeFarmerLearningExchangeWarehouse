package com.etoak.service.impl;

import com.etoak.service.QuartzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class QuartzServiceImpl implements QuartzService {
    @Autowired
    private UserServiceImpl userService;
    //@Scheduled(cron = "0 0/1 * * * ? ")
    public void systemOut(){
        //System.out.println("我是定时任务,每一分钟执行一次");
    }
    //@Scheduled(cron = "0 0/1 * * * ? ")
    public void thread(){
        ThreadServiceImpl threadService=new ThreadServiceImpl();
        threadService.start();
        CallableServiceImpl callableService=new CallableServiceImpl();
        RunnableServiceImpl runnableService=new RunnableServiceImpl();
        Thread thread=new Thread(runnableService);
        thread.start();
    }
}
