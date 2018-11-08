package com.wei.demo.decorater.condiment;

import com.wei.demo.decorater.Beverage;
import com.wei.demo.decorater.CondimentDecorator;
import com.wei.demo.decorater.Constant;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + Constant.MILK_COST;
    }
}
