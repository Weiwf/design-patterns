package com.wei.demo.factory.factorymethod.concrete.ny;


import com.wei.demo.factory.Pizza;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * 纽约ham pizza
 */
public class NYHamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare hamPizza!");
    }
}
