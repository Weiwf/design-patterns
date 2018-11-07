package com.wei.demo.observer.concrete;

import com.wei.demo.observer.Display;
import com.wei.demo.observer.Observer;
import com.wei.demo.observer.Subject;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class Observer2 implements Observer, Display {

    private int pressure;

    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void dataChange(int temperature, int humudity, int pressure) {
        this.pressure = pressure;
        display();

    }

    @Override
    public void display() {
        System.out.println("i`m observer2,i got changed data.[" + "pressure = " + pressure + "]");
    }
}
