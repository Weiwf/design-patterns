package com.wei.demo.strategy.quack;

import com.wei.demo.strategy.QuackBehavior;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class QuackGaga implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack gaga!");
    }
}
