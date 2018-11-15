package com.wei.demo.singleton;

/**
 * @Author: weiwenfeng
 * @Date: 2018/11/13
 *
 * 双重检查加锁：第一次检查保证只在第一次实例化时进入到同步块中，用以提升性能；
 * 第二次检查保证多个等候的线程在进入到同步块中时只有一个线程执行instance = new Singleton();的操作
 *
 * instance = new Singleton()非原子操作：
 * (1)给instance分配内存
 * (2)调用new Singleton()初始化成员变量
 * (3)将instance指向分配的内存空间
 * 上面的三个步骤顺序不能乱，否则使用实例的时候将报错
 * volatile将起禁止指令重排的作用
 */
public class Singleton {
    // 声明为volatile
    private volatile static Singleton instance = null;
    // 私有的构造方法确保只能从内部产生实力，而不能通过new的方式
    private Singleton(){

    }

    public static Singleton getInstance(){
        if (null == instance){
            synchronized (Singleton.class){
                if (null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
