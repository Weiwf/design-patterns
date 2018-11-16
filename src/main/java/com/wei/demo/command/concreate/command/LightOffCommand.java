package com.wei.demo.command.concreate.command;

import com.wei.demo.command.Command;
import com.wei.demo.command.Light;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 命令封装“动作”：关灯的命令拥有其作用对象的引用，并能在需要时执行相应的动作
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
