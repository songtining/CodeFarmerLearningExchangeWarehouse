package com.etoak.service;

import com.alibaba.fastjson.JSONObject;

public interface UserService {
    String getUserName();
    JSONObject checkUserName(String username, String password);
}
