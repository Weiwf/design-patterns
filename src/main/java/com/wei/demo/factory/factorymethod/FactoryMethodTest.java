package com.wei.demo.factory.factorymethod;

import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.PizzaStore;
import com.wei.demo.factory.factorymethod.concrete.ny.NYPizzaStoreFactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStoreFactory();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
        pizza.printInfo();
    }
}
