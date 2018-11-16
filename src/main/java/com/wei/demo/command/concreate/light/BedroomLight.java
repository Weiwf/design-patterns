package com.wei.demo.command.concreate.light;

import com.wei.demo.command.Light;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 卧室灯
 */
public class BedroomLight implements Light {
    @Override
    public void on() {
        System.out.println("Turn on bedroom light!");
    }

    @Override
    public void off() {
        System.out.println("Turn off bedroom light!");
    }
}
