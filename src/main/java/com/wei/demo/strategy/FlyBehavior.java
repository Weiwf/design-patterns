package com.wei.demo.strategy;

/**
 *  飞行行为，不是所有的鸭子都可以飞，所以用接口定义，
 *  让可以飞行的鸭子”有一个“飞行行为，具体飞行行为由子类实现
 */
public interface FlyBehavior {
    void fly();
}
