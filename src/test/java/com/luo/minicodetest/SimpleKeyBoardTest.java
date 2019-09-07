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

    @Test
    public void TestZeroToNine() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"9"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }

    @Test
    public void TestZeroToNinetyNine() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"9", "9"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }

    @Test
    public void ZeroInput() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }

    @Test
    public void greaterThan2Input() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"9", "9", "9"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }


    @Test
    public void randomInput() {
        IKeyboard simpleKeyboard = new SimpleKeyboard();
        String[] arr = {"*", "#"};
        System.out.println(String.format("Input: %s", Arrays.toString(arr)));
        System.out.println(String.format("OutPut: %s", simpleKeyboard.sinkResult(arr)));
    }


}
