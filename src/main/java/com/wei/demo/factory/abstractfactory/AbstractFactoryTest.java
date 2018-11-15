package com.wei.demo.factory.abstractfactory;

import com.wei.demo.factory.Pizza;
import com.wei.demo.factory.PizzaStore;
import com.wei.demo.factory.abstractfactory.concreatefactory.ChicagoIngredientFactory;
import com.wei.demo.factory.abstractfactory.concreatefactory.NYIngredientFactory;
import com.wei.demo.factory.abstractfactory.concretestore.PizzaStoreA;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 预定纽约的cheese pizza
        PizzaStore pizzaStoreNY = new PizzaStoreA(new NYIngredientFactory());
        Pizza pizza = pizzaStoreNY.orderPizza("cheese");
        pizza.prepare();
        pizza.printInfo();

        // 芝加哥的ham pizza
        System.out.println();
        PizzaStore pizzaStoreChicago = new PizzaStoreA(new ChicagoIngredientFactory());
        Pizza pizza1 = pizzaStoreChicago.orderPizza("ham");
        pizza1.prepare();
        pizza1.printInfo();

        // 芝加哥的other pizza
        System.out.println();
        Pizza pizza2 = pizzaStoreChicago.orderPizza("other");
        pizza2.prepare();
        pizza2.printInfo();
    }
}
