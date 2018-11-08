package com.wei.demo.decorater;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     * 定义抽象方法，让子类实现以在父类getDescription()的基础上加上自定义的操作
     * @return
     */
    public abstract String getDescription();
}
