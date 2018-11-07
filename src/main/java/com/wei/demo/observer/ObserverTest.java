package com.wei.demo.observer;

import com.wei.demo.observer.concrete.Observer1;
import com.wei.demo.observer.concrete.Observer2;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer observer1 = new Observer1(subject);
        Observer onserver2 = new Observer2(subject);
        subject.changeData(25,65,96);

    }
}
