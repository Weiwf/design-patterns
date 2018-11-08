package com.wei.demo.decorater.beverage;

import com.wei.demo.decorater.Beverage;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public class Expresso extends Beverage {
    public Expresso(){
        description = "expresso";
    }

    @Override
    public float cost() {
        return 0;
    }
}
