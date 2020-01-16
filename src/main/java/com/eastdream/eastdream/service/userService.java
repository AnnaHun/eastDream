package com.eastdream.eastdream.service;

import com.eastdream.eastdream.dao.User;

/**
 * 用户管理服务接口
 */
public interface userService {
    /**
     * 保存一个用户
     *
     * @param user
     * @return
     */
    public String saveUser(User user);
}
