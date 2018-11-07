package com.wei.demo.strategy;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 *
 * 定义成抽象类而不是接口是因为有swim()这块公共的部分
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    /**
     *  setter方法可以在运行时改变行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     *  公共的部分，但子类变现各不相同
     */
    public abstract void display();

    /**
     *  公共不变的部分
     */
    public void swim(){
        System.out.println("i`m duck,i can swim!");
    }

    public void showFly(){
        this.flyBehavior.fly();
    }

    public void showQuack(){
        this.quackBehavior.quack();
    }
}
