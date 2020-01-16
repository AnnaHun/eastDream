package com.eastdream.eastdream.controller;

import com.alibaba.fastjson.JSONObject;
import com.eastdream.eastdream.dao.User;
import com.eastdream.eastdream.service.userService;
import com.eastdream.eastdream.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理controller
 */
@Controller
public class usersController {
    /**
     * 注入用户管理服务
     */
    @Autowired
    private userService userService;

    /**
     * 注册页面
     *
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        return "regist/regist.html";
    }

    /**
     * 用户注册
     *
     * @param registeredForm
     * @return
     */
    @RequestMapping(value = "registerSystem", method = RequestMethod.POST)
    @ResponseBody
    public String registerSystem(String registeredForm) {
        User user = JSONObject.parseObject(registeredForm, User.class);
        user.setUuid(uuidUtil.getUUid());
        String msg = userService.saveUser(user);
        return "success";
    }

}
