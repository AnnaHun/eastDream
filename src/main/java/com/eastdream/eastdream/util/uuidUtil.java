package com.eastdream.eastdream.util;

import java.util.UUID;

/**
 * uuid工具类
 */
public class uuidUtil {
    /**
     * 创建32位的UUID
     *
     * @return
     */
    public static String getUUid() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    /**
     * 自定义生成指定位数的uuid
     *
     * @param num
     * @return
     */
    public static String getUUid(int num) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, num);
        return uuid;
    }

    /**
     * 生成数字和大写字母组成的随机字符
     *
     * @return
     */
    public static String getUpperUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        return uuid;
    }
}
