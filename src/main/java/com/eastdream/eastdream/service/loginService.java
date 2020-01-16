package com.eastdream.eastdream.service;

import com.eastdream.eastdream.dao.User;

/**
 * 登陆服务
 */
public interface loginService {
    /**
     * 通过用户名密码找出用户
     *
     * @param logName
     * @param password
     * @return
     */
    public User getUser(String logName, String password);
}
