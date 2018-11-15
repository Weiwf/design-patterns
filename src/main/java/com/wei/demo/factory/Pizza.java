package com.wei.demo.factory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 *
 *  Pizza由面团，调味料，奶酪，火腿等一种或多种原料组成
 */
public abstract class Pizza {

    // 面团
    protected String dough;

    // 调味料
    protected String sause;

    // 奶酪
    protected String cheese;

    // 火腿
    protected String ham;

    public void bake(){
        System.out.println("pizza bake!");
    }

    public void cut(){
        System.out.println("pizza cut!");
    }

    public void box(){
        System.out.println("pizza box!");
    }

    public abstract void prepare();
}
