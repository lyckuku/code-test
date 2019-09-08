package com.luo.minicodetest.button;

/**
 *
 *
 * @author luoyongchun
 * @description:静态抽象工厂  用于创建 需要的 九宫格按钮 对象
 * @date: Created In 19:06 on 2019-09-07.
 */
public class ButtonFactory {
    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String DIY1 = "*";
    public static final String DIY2 = "#";


    private ButtonFactory() {

    }

    /**
     * 通过按钮名称 创建需要的对象
     * @param buttonName 按钮名称
     * @return 返回一个按钮对象
     */
    public static Button genButton(String buttonName) {
        switch (buttonName) {
            case ZERO:
                Button zeroButton = new Button(ZERO, null);
                return zeroButton;

            case ONE:
                Button oneButton = new Button(ONE, null);
                return oneButton;

            case TWO:
                Button twoButton = new Button(TWO, new String[]{"A", "B", "C"});
                return twoButton;

            case THREE:
                Button threeButton = new Button(THREE, new String[]{"D", "E", "F"});
                return threeButton;

            case FOUR:
                Button fourButton = new Button(FOUR, new String[]{"G", "H", "I"});
                return fourButton;

            case FIVE:
                Button fiveButton = new Button(FIVE, new String[]{"J", "K", "L"});
                return fiveButton;

            case SIX:
                Button sixButton = new Button(SIX, new String[]{"M", "N", "O"});
                return sixButton;

            case SEVEN:
                Button sevenButton = new Button(SEVEN, new String[]{"P", "Q", "R", "S"});
                return sevenButton;

            case EIGHT:
                Button eightButton = new Button(EIGHT, new String[]{"T", "U", "V"});
                return eightButton;

            case NINE:
                Button nineButton = new Button(NINE, new String[]{"W", "X", "Y", "Z"});
                return nineButton;

            case DIY1:
                Button diy1Button = new Button(DIY1, null);
                return diy1Button;

            case DIY2:
                Button diy2Button = new Button(DIY2, null);
                return diy2Button;

            default:
                throw new RuntimeException("Button is not exist");
        }
    }

}
