package com.wei.demo.factory;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/15
 * <p>
 * Pizza由面团，调味料，奶酪，火腿等一种或多种原料组成
 */
public abstract class Pizza {

    protected String name;

    // 面团
    protected String dough;

    // 调味料
    protected String sause;

    // 奶酪
    protected String cheese;

    // 火腿
    protected String ham;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("pizza bake!");
    }

    public void cut() {
        System.out.println("pizza cut!");
    }

    public void box() {
        System.out.println("pizza box!");
    }

    public void printInfo() {
        System.out.println(name + " contains: " + "dough = " + dough + ",sause = " + sause
                + ",cheese = " + cheese + ",ham = " + ham);
    }

    public abstract void prepare();
}
