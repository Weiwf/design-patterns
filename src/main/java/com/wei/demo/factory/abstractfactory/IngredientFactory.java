package com.wei.demo.factory.abstractfactory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 * 原料工厂
 */
public interface IngredientFactory {

    String createDough();

    String createSause();

    String createCheese();

    String createHam();
}
