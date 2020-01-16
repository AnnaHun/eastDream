package com.eastdream.eastdream.util;

import java.util.HashMap;
import java.util.List;

/**
 * layui工具类
 */
public class LayuiUtil extends HashMap<String, Object> {
    /**
     * 将集合变成layui表可以接受的对象
     *
     * @param count
     * @param data
     * @return
     */
    public static LayuiUtil data(Integer count, List<?> data) {
        LayuiUtil r = new LayuiUtil();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
}
