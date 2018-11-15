package com.wei.demo.factory.abstractfactory.concreatefactory;

import com.wei.demo.factory.abstractfactory.IngredientFactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * 芝加哥原料工厂
 */
public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public String createDough() {
        return "Chicago dough!";
    }

    @Override
    public String createSause() {
        return "Chicago sause!";
    }

    @Override
    public String createCheese() {
        return "Chicago cheese!";
    }

    @Override
    public String createHam() {
        return "Chicago ham!";
    }
}
