package com.wei.demo.command.concreate.light;

import com.wei.demo.command.Light;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 客厅灯
 */
public class LivingroomLight implements Light {
    @Override
    public void on() {
        System.out.println("Turn on living room light!");
    }

    @Override
    public void off() {
        System.out.println("Turn off living room light!");
    }
}
