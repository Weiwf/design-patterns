package com.wei.demo.observer.concrete;

import com.wei.demo.observer.Display;
import com.wei.demo.observer.Observer;
import com.wei.demo.observer.Subject;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class Observer1 implements Observer, Display {
    private int temperature;

    private int humidity;

    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void dataChange(int temperature, int humudity, int pressure) {
        this.temperature = temperature;
        this.humidity = humudity;
        display();
    }

    @Override
    public void display() {
        System.out.println("i`m observer1,i got changed data.[temperature = " + temperature +
                ",humidity = " + humidity + "]");
    }
}
