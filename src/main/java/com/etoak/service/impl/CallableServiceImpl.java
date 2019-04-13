package com.etoak.service.impl;

import java.util.concurrent.Callable;

public class CallableServiceImpl implements Callable<String> {
    public String call() throws Exception{
        return "我是Callable线程";
    }
}
