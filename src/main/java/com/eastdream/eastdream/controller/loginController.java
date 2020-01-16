package com.eastdream.eastdream.controller;

import com.alibaba.fastjson.JSONObject;
import com.eastdream.eastdream.dao.User;
import com.eastdream.eastdream.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登陆controller
 */
@Controller
public class loginController {


    /**
     * 注入登陆服务
     */
    @Autowired
    private loginService loginService;

    /**
     * 登陆页面
     *
     * @return
     */
    @GetMapping("/")
    public String layuiTest() {
        return "index.html";
    }

    /**
     * 后台主页面
     *
     * @return
     */
    @GetMapping("/backendSpace")
    public String backendSpace() {
        return "backSpace/mainBack.html";
    }

    /**
     * 账号密码登陆
     *
     * @param loginForm
     * @return
     */
    @RequestMapping(value = "loginSystem", method = RequestMethod.GET)
    @ResponseBody
    public String loginSystem(String loginForm) {
        System.out.println(loginForm);
        User user = JSONObject.parseObject(loginForm, User.class);
        String logName = user.getLogName();
        String password = user.getPassword();
        final User loginUser = loginService.getUser(logName, password);

        String uuid = loginUser.getUuid();
        if (uuid.isEmpty()) {
            return "you are not admin to login!!";
        }
        return "success";
    }

}
