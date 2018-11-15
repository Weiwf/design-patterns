package com.wei.demo.factory.factorymethod.concrete.ny;


import com.wei.demo.factory.Pizza;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * 纽约other pizza
 */
public class NYOtherPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare otherPizza!");
    }
}
