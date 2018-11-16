package com.wei.demo.command;

import com.wei.demo.command.concreate.command.LightOffCommand;
import com.wei.demo.command.concreate.command.LightOnAndOffCommand;
import com.wei.demo.command.concreate.command.LightOnCommand;
import com.wei.demo.command.concreate.command.NoCommand;
import com.wei.demo.command.concreate.light.LivingroomLight;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 */
public class CommandTest {

    public static void main(String[] args) {
        SimpleControl simpleControl = new SimpleControl(4);
        Light light = new LivingroomLight();

        // 打开灯
        Command command1 = new LightOnCommand(light);
        simpleControl.setCommand(0,command1);
        simpleControl.buttonWasPressed(0);

        // 关闭灯
        Command command2 = new LightOffCommand(light);
        simpleControl.setCommand(1,command2);
        simpleControl.buttonWasPressed(1);

        // 什么都不做的命令
        Command command3 = new NoCommand();
        simpleControl.setCommand(2,command3);
        simpleControl.buttonWasPressed(2);

        // 打开然后关闭灯
        Command command4 = new LightOnAndOffCommand(light);
        simpleControl.setCommand(3,command4);
        simpleControl.buttonWasPressed(3);
    }
}
