package com.luo.minicodetest.keyboard;

/**
 * @author luoyongchun
 * @description: 定义一个接口  (便于模板的 扩展)
 * @date: Created In 18:52 on 2019-09-07.
 */
public interface IKeyboard {
    /**
     * 根据输入输出结果
     *
     *
     * @param inputArr 输入参数
     * @return 映射的字母信息
     */
    String sinkResult(String[] inputArr);
}
