package com.wei.demo.strategy;


/**
 *  叫的行为，不是所有的鸭子都可以叫，让可以叫的鸭子“有一个”叫的行为，
 *  具体叫的行为由子类实现
 */
public interface QuackBehavior {
    void quack();
}
