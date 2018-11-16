package com.wei.demo.command;

import com.wei.demo.command.concreate.command.NoCommand;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 控制器，拥有多个命令
 */
public class SimpleControl {

    // 数组，以支持多个不同的命令
    private Command[] commands;

    public SimpleControl(int commanNum){
        // 初始化支持的命令数量
        commands = new Command[commanNum];
        Command noCommand = new NoCommand();
        for (int i = 0; i < commanNum;i++){
            // 将命令默认置为空命令
            commands[i] = noCommand;
        }
    }

    /**
     * 设置命令
     * @param index
     * @param command
     */
    public void setCommand(int index,Command command) {
        this.commands[index] = command;
    }

    /**
     * 执行index对应的命令
     * @param index
     */
    public void buttonWasPressed(int index){
        commands[index].execute();
    }
}
