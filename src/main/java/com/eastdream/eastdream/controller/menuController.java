package com.eastdream.eastdream.controller;

import com.alibaba.fastjson.JSONObject;
import com.eastdream.eastdream.dao.Menu;
import com.eastdream.eastdream.service.menuService;
import com.eastdream.eastdream.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class menuController {
    @Autowired
    private menuService menuService;

    @RequestMapping(value = "/saveMenu",method = RequestMethod.POST)
    @ResponseBody
    public String saveMenu(String menuForm){
        Menu menu = JSONObject.parseObject(menuForm, Menu.class);
        String uuid = menu.getUuid();
        if (uuid.isEmpty()){
            menu.setUuid(uuidUtil.getUUid());
            String msg = menuService.saveMenu(menu);
            if (msg == "success"){
                return "success";
            }
        }else{
            return "already have this menu";
        }
        return "";
    }
}
