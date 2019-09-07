package com.luo.minicodetest.utils;

/**
 * @author luoyongchun
 * @description: 工具类 用于判断 数组是否为空
 * @date: Created In 19:56 on 2019-09-07.
 */
public class ArrayUtil {

    public static boolean isEmpty(Object[] arr) {
        return arr == null || arr.length == 0;
    }

    public static boolean isNotEmpty(Object[] arr) {
        return !isEmpty(arr);
    }

}
