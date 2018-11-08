package com.wei.demo.decorater;


import com.wei.demo.decorater.beverage.Decaf;
import com.wei.demo.decorater.condiment.Milk;
import com.wei.demo.decorater.condiment.Soy;
import com.wei.demo.decorater.condiment.Whip;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public class DecoraterTest {
    public static void main(String[] args) {

        Beverage beverage = new Decaf();
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
    }
}
