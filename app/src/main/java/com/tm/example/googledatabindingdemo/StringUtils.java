package com.tm.example.googledatabindingdemo;

/**
 * Created by Tian on 2016/9/30.
 */

public class StringUtils {
    /**
     * 转换首字母大写
     * @param str
     * @return
     */
    public static String capitalize(final String str) {
        if (str.length() > 1) {
            return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
        }
        return str;
    }
}
