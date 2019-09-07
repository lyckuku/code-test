package com.luo.minicodetest.keyboard;

import com.luo.minicodetest.button.Button;
import com.luo.minicodetest.utils.ArrayUtil;

/**
 * @author luoyongchun
 * @description:
 * @date: Created In 19:00 on 2019-09-07.
 */
public class SimpleKeyboard extends AbstractKeyboard {
    public static final String space = " ";

    @Override
    protected String convertDigitsToLetters(Button button1, Button button2) {
        StringBuilder letterResult = new StringBuilder();
        String[] letterArr1 = button1 != null ? button1.getLetterArr() : null;
        String[] letterArr2 = button2 != null ? button2.getLetterArr() : null;

        if (ArrayUtil.isNotEmpty(letterArr1) && ArrayUtil.isEmpty(letterArr2)) {
            for (String letter : letterArr1) {
                letterResult.append(letter).append(space);
            }
        } else if (ArrayUtil.isNotEmpty(letterArr2) && ArrayUtil.isEmpty(letterArr1)) {
            for (String letter : letterArr2) {
                letterResult.append(letter).append(space);
            }
        } else if (ArrayUtil.isNotEmpty(letterArr1) && ArrayUtil.isNotEmpty(letterArr2)) {
            for (String letter1 : letterArr1) {
                for (String letter2 : letterArr2) {
                    letterResult.append(letter1).append(letter2).append(space);
                }
            }
        }
        return letterResult.toString();
    }

    @Override
    protected String convertDigitsToLetters(Button button) {

        return convertDigitsToLetters(button, null);
//        StringBuilder letterResult = new StringBuilder();
//        String[] letterArr = button != null ? button.getLetterArr() : null;
//        if (letterArr != null && letterArr.length > 0) {
//            for (String letter : letterArr) {
//                letterResult.append(letter).append(space);
//            }
//
//        }
//        return letterResult.toString();
//    }

    }
}
