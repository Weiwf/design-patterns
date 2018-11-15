package com.wei.demo.factory.abstractfactory.concretestore;


import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.PizzaStore;
import com.wei.demo.factory.abstractfactory.IngredientFactory;
import com.wei.demo.factory.abstractfactory.concretepizza.CheesePizza;
import com.wei.demo.factory.abstractfactory.concretepizza.HamPizza;
import com.wei.demo.factory.abstractfactory.concretepizza.OtherPizza;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public class PizzaStoreA extends PizzaStore {

    private IngredientFactory ingredientFactory;

    public PizzaStoreA(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza getPizza(String type) {
        Pizza pizza;
        String suffix = " pizza";
        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
        }else if (type.equals("ham")){
            pizza = new HamPizza(ingredientFactory);
        }else{
            pizza = new OtherPizza(ingredientFactory);
        }
        pizza.setName(type + suffix);
        return pizza;
    }
}
