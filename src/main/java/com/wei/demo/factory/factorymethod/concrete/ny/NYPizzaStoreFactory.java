package com.wei.demo.factory.factorymethod.concrete.ny;


import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.PizzaStore;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public class NYPizzaStoreFactory extends PizzaStore {

    @Override
    public Pizza getPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if (type.equals("ham")){
            pizza = new NYHamPizza();
        }else if (type.equals("chiken")){
            pizza = new NYChikenPizza();
        }

        return pizza;
    }
}
