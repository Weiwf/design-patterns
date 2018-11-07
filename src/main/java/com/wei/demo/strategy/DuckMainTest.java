package com.wei.demo.strategy;

import com.wei.demo.strategy.duck.RedHeadDcuk;
import com.wei.demo.strategy.duck.WoodDuck;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class DuckMainTest {
    public static void main(String[] args) {
        Duck duck = new RedHeadDcuk();
        duck.display();
        duck.showFly();
        duck.showQuack();

        Duck duck1 = new WoodDuck();
        duck1.display();
        duck1.showFly();
        duck1.showQuack();
    }
}
