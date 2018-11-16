package com.wei.demo.command.concreate.command;

import com.wei.demo.command.Command;
import com.wei.demo.command.Light;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
