package com.wei.demo.observer;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/7
 */
public interface Observer {

    void dataChange(int temperature,int humudity,int pressure);
}
