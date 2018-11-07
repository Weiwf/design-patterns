package com.wei.demo.strategy.duck;

import com.wei.demo.strategy.Duck;
import com.wei.demo.strategy.fly.FlyNone;
import com.wei.demo.strategy.quack.QuackNone;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 *
 * 木头鸭：不会飞，不会叫，但是会游泳
 */
public class WoodDuck extends Duck {

    public WoodDuck(){
        flyBehavior = new FlyNone();
        quackBehavior = new QuackNone();
    }

    @Override
    public void display() {
        System.out.println("i`m wood dick,i display like a wood!");
    }
}
