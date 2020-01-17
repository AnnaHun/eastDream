package com.eastdream.eastdream.service;

import com.eastdream.eastdream.dao.Menu;

import java.util.List;

public interface menuService {
    public List<Menu> getMenus();

    public String saveMenu(Menu menu);

    public Menu getMenu(String uuid);
}
