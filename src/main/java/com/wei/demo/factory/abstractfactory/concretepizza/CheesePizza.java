package com.wei.demo.factory.abstractfactory.concretepizza;

import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.abstractfactory.IngredientFactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * Cheese pizza 由dough,sause,cheese组成
 */
public class CheesePizza extends Pizza {

    private IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sause = ingredientFactory.createSause();
        cheese = ingredientFactory.createCheese();
    }
}
