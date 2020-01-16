package com.eastdream.eastdream.mapper;

import com.eastdream.eastdream.dao.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户mapper
 */
@Component
public interface UserMapper {
    /**
     * 创建一个新用户
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 查询所有的用户
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 根据用户名密码查询用户
     *
     * @param logName
     * @param password
     * @return
     */
    User selectUser(String logName, String password);
}