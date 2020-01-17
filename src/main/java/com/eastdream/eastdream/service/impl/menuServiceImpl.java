package com.eastdream.eastdream.service.impl;

import com.eastdream.eastdream.dao.Menu;
import com.eastdream.eastdream.mapper.MenuMapper;
import com.eastdream.eastdream.service.menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class menuServiceImpl implements menuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> getMenus() {
        List<Menu> menus = menuMapper.selectAll();
        return menus;
    }

    @Override
    public String saveMenu(Menu menu) {
        String msg = "trouble maker";
        int ren = menuMapper.insert(menu);
        if (ren == 1){
            msg = "success";
        }
        return msg;
    }
}
