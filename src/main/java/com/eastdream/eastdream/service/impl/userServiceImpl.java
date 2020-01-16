package com.eastdream.eastdream.service.impl;

import com.eastdream.eastdream.dao.User;
import com.eastdream.eastdream.mapper.UserMapper;
import com.eastdream.eastdream.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户管理服务
 */
@Service
public class userServiceImpl implements userService {
    /**
     * 注入用户mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 保存新用户
     *
     * @param user
     * @return
     */
    @Override
    public String saveUser(User user) {
        String msg = null;
        int i = 0;
        try {
            i = userMapper.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            msg = "success";
        }
        return msg;
    }
}
