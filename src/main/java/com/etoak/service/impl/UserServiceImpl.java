package com.etoak.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.etoak.dao.UserDao;
import com.etoak.pojo.User;
import com.etoak.service.UserService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    public User getUser1() {
        return user1;
    }
    public void setUser1(User user1) {
        this.user1 = user1;
    }
    private User user1;
    @Autowired
    private UserDao userDao;
    public String getUserName(){
         User user=userDao.getUserName();
        return user.getName();
    }
    public  void testThread(String methodName){
        for (int i=0 ;i<100;i++){
            System.out.println("我是"+methodName+"方法,第"+i+"个参数");
        }
    }
    @Override
    public JSONObject checkUserName(String username, String password){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);
        User user=userDao.checkUserName(map);
        JSONObject jsonObject=new JSONObject();
        if (user==null){
            jsonObject.put("flag",false);
            jsonObject.put("msg","用户不存在!!!");
        }else{
            if(user.getPassword().equals(password)){
                jsonObject.put("flag",true);
                jsonObject.put("msg","登陆成功!!!");
            }else{
                jsonObject.put("flag",false);
                jsonObject.put("msg","密码错误!!!");
            }
        }
        return jsonObject;
    }
}
