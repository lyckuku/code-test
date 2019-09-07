package com.luo.minicodetest.button;

/**
 * @author luoyongchun
 * @description: 9公格 按钮
 * @date: Created In 18:39 on 2019-09-07.
 */
public class Button {
    /**
     * 按钮名称
     */
    private String name;
    /**
     * 按钮映射字母
     */
    private String[] letterArr;

    /**
     * 通过构造方法传递参数
     * @param name 按钮名称
     * @param letterArr  按钮映射的字母对象
     */

    public Button(String name, String[] letterArr) {
        this.name = name;
        this.letterArr = letterArr;
    }

    public String getName() {
        return name;
    }

    public String[] getLetterArr() {
        return letterArr;
    }

}
