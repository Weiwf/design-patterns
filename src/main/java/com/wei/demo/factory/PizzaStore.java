package com.wei.demo.factory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = null;

        pizza = getPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza getPizza(String type);
}
