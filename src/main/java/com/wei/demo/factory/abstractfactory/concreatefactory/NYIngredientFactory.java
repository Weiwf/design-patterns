package com.wei.demo.factory.abstractfactory.concreatefactory;

import com.wei.demo.factory.abstractfactory.IngredientFactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * 纽约原料工厂
 */
public class NYIngredientFactory implements IngredientFactory{

    @Override
    public String createDough() {
        return "create NY dough!";
    }

    @Override
    public String createSause() {
        return "create NY sause!";
    }

    @Override
    public String createCheese() {
        return "create NY cheese!";
    }

    @Override
    public String createHam() {
        return "create NY ham!";
    }
}
