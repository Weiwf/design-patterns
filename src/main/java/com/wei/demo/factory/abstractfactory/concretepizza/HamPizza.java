package com.wei.demo.factory.abstractfactory.concretepizza;

import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.abstractfactory.IngredientFactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 *  Hampizza 由gough,sause,ham组成
 */
public class HamPizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public HamPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sause = ingredientFactory.createSause();
        ham = ingredientFactory.createHam();
    }
}
