package com.luo.minicodetest;

import com.luo.minicodetest.keyboard.IKeyboard;
import com.luo.minicodetest.keyboard.SimpleKeyboard;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author luoyongchun
 * @description:
 * @date: Created In 20:19 on 2019-09-07.
 */
public class SimpleKeyBoardTest {
    /**
     * 测试 0到9  (一个按钮)
     */

    @Test
    public void TestZeroToNine() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"8"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }
    /**
     * 测试 9 9  (2个按钮)
     */
    @Test
    public void TestZeroToNinetyNine() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"9", "9"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }

    /**
     * 测试 0  不映射 字母
     */
    @Test
    public void ZeroInput() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"0"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }
    /**
     * 测试  按钮数不超过2个
     */
    @Test
    public void greaterThan2Input() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"9", "99","9999"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }

    /**
     * 测试 * # 不映射字母
     */

    @Test
    public void randomInput() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"*", "#"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }


}
