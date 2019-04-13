package com.etoak.dao;

import com.etoak.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserDao {
    public User getUserName();
    public  User checkUserName(@Param("map") Map<String,Object> map);
}
