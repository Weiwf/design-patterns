package com.wei.demo.decorater.condiment;

import com.wei.demo.decorater.Beverage;
import com.wei.demo.decorater.CondimentDecorator;
import com.wei.demo.decorater.Constant;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",soy";
    }

    @Override
    public float cost() {
        return beverage.cost() + Constant.SOY_COST;
    }
}
