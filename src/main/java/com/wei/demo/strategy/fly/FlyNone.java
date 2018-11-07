package com.wei.demo.strategy.fly;

import com.wei.demo.strategy.FlyBehavior;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class FlyNone implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i cann`t fly!");
    }
}
