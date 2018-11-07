package com.wei.demo.strategy.duck;

import com.wei.demo.strategy.Duck;
import com.wei.demo.strategy.fly.FlyHigh;
import com.wei.demo.strategy.quack.QuackGaga;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 *
 * 红头鸭：红色的头，会飞会叫
 */
public class RedHeadDcuk extends Duck {

    public RedHeadDcuk(){
        flyBehavior = new FlyHigh();
        quackBehavior = new QuackGaga();
    }

    @Override
    public void display() {
        System.out.println("i`m redhead duck ,my head is red!");
    }
}
