package com.wei.demo.decorater;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/8
 */
public abstract class Beverage {
    public String description = "unknown description";

    public String getDescription(){
        return description;
    }

    public abstract float cost();
}
