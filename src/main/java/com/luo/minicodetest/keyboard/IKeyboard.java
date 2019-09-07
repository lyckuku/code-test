package com.luo.minicodetest.keyboard;

/**
 * @author luoyongchun
 * @description: 定义一个接口 便于扩展（以后可能会有3个 或者更多 按钮的映射  新增方法逻辑即可 不需要修改已经写好的代码）
 * @date: Created In 18:52 on 2019-09-07.
 */
public interface IKeyboard {
    /**
     * 根据输入输出结果
     * 目前只针对一个或者2个按钮的映射
     *
     * @param inputArr 输入参数
     * @return 映射的字母信息
     */
    String sinkResult(String[] inputArr);
}
