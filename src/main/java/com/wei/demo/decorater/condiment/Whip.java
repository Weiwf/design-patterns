package com.wei.demo.decorater.condiment;

import com.wei.demo.decorater.Beverage;
import com.wei.demo.decorater.CondimentDecorator;
import com.wei.demo.decorater.Constant;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 *
 * Whip "是一个" Beverage，也 “有一个” Beverage，这样使得它可以装饰Beverage的子类也可以被Beverage装饰
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",whip";
    }

    @Override
    public float cost() {
        return beverage.cost() + Constant.WHIP_cost;
    }
}
