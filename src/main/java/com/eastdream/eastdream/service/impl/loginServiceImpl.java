package com.eastdream.eastdream.service.impl;

import com.eastdream.eastdream.dao.User;
import com.eastdream.eastdream.mapper.UserMapper;
import com.eastdream.eastdream.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登陆service
 */
@Service
public class loginServiceImpl implements loginService {

    /**
     * 注入用户mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 通过用户名密码获取用户
     *
     * @param logName
     * @param password
     * @return
     */
    @Override
    public User getUser(String logName, String password) {
        User user = userMapper.selectUser(logName, password);
        return user;
    }

    public String delUsers(User user) {
        return "failed";
    }
}
