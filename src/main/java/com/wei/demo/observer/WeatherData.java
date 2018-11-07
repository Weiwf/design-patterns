package com.wei.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public class WeatherData implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private int temperature;

    private int humidity;

    private int pressure;

    /**
     * 注册观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer){
        int index = observers.indexOf(observer);
        if (index >= 0){
            observers.remove(index);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.dataChange(this.temperature,this.humidity,this.pressure);
        }
    }

    /**
     * 数据改变
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void changeData(int temperature,int humidity,int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();
    }

}
