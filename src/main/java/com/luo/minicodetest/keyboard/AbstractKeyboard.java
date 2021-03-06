package com.luo.minicodetest.keyboard;

import com.luo.minicodetest.button.Button;
import com.luo.minicodetest.button.ButtonFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author luoyongchun
 * @description:业务抽象类
 * @date: Created In 18:55 on 2019-09-07.
 */
public abstract class AbstractKeyboard implements IKeyboard {
    // 定义按钮个数
    private static final int MAX_INPUT = 2;
    private static final int ONE_INPUT = 1;
    private static final int ZERO_INPUT = 0;

    private Map<String, Button> buttonMap;

    {
        buttonMap = new HashMap<>();
        buttonMap.put(ButtonFactory.ONE, ButtonFactory.genButton(ButtonFactory.ONE));
        buttonMap.put(ButtonFactory.TWO, ButtonFactory.genButton(ButtonFactory.TWO));
        buttonMap.put(ButtonFactory.THREE, ButtonFactory.genButton(ButtonFactory.THREE));

        buttonMap.put(ButtonFactory.FOUR, ButtonFactory.genButton(ButtonFactory.FOUR));
        buttonMap.put(ButtonFactory.FIVE, ButtonFactory.genButton(ButtonFactory.FIVE));
        buttonMap.put(ButtonFactory.SIX, ButtonFactory.genButton(ButtonFactory.SIX));

        buttonMap.put(ButtonFactory.SEVEN, ButtonFactory.genButton(ButtonFactory.SEVEN));
        buttonMap.put(ButtonFactory.EIGHT, ButtonFactory.genButton(ButtonFactory.EIGHT));
        buttonMap.put(ButtonFactory.NINE, ButtonFactory.genButton(ButtonFactory.NINE));

        buttonMap.put(ButtonFactory.DIY1, ButtonFactory.genButton(ButtonFactory.DIY1));
        buttonMap.put(ButtonFactory.ZERO, ButtonFactory.genButton(ButtonFactory.ZERO));
        buttonMap.put(ButtonFactory.DIY2, ButtonFactory.genButton(ButtonFactory.DIY2));
    }

    /**
     * 根据输入参数 得到 输出结果
     *
     * @param inputArr 输入参数
     * @return 按钮映射的字母
     */
    @Override
    public  String sinkResult(String[] inputArr) {

        try {
            //参数校验
            checkInput(inputArr);

            if (inputArr.length == ONE_INPUT) {
                return convertDigitsToLetters(buttonMap.get(inputArr[ONE_INPUT - 1]));
            } else {
                return convertDigitsToLetters(buttonMap.get(inputArr[ONE_INPUT - 1]), buttonMap.get(inputArr[MAX_INPUT - 1]));
            }
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 参数校验
     */
    protected void checkInput(String[] inputArr) {
        if (inputArr == null || inputArr.length == ZERO_INPUT || inputArr.length > MAX_INPUT) {
            throw new IllegalArgumentException("请输入0-99按钮!");
        }
        Set<String> buttonNames = buttonMap.keySet();
        for (String input : inputArr) {
            if (!buttonNames.contains(input)) {
                throw new IllegalArgumentException(String.format("输入参数不合法! 不能为%s", input));
            }
        }
    }

    /**
     * 数字转字母 （2个按钮)
     *
     * @param button1 第一个按钮对象
     * @param button2 第2个按钮对象
     * @return 按钮 映射的字母
     */
    protected abstract String convertDigitsToLetters(Button button1, Button button2);

    /**
     * 数字转字母(一个按钮)
     *
     * @param button 按钮对象
     * @return 按钮 映射的字母
     */
    protected abstract String convertDigitsToLetters(Button button);

}
