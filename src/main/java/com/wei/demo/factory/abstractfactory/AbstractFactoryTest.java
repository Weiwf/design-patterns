package com.wei.demo.factory.abstractfactory;

import com.wei.demo.factory.PizzaStore;
import com.wei.demo.factory.abstractfactory.concreatefactory.NYIngredientFactory;
import com.wei.demo.factory.abstractfactory.concretestore.NYPizzaStore;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore(new NYIngredientFactory());
        pizzaStore.orderPizza("cheese");
    }
}
