package com.wei.demo.decorater.beverage;

import com.wei.demo.decorater.Beverage;
import com.wei.demo.decorater.Constant;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "decaf";
    }

    @Override
    public float cost() {
        return Constant.DECAF_COST;
    }
}
