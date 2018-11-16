package com.wei.demo.command.concreate.command;

import com.wei.demo.command.Command;
import com.wei.demo.command.Light;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 打开灯3秒后关闭灯
 */
public class LightOnAndOffCommand implements Command {

    private Light light;

    public LightOnAndOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("----------------");
        light.on();
        System.out.println("wait for 3 seconds...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        light.off();
        System.out.println("----------------");
    }
}
