package com.wei.demo.command.concreate.command;

import com.wei.demo.command.Command;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/16
 *
 * 什么也不做的命令
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand do nothing!");
    }
}
