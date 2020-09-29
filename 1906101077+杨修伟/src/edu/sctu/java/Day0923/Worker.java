package edu.sctu.java.Day0923;

public class Worker implements PersonAction{

    @Override
    public void study() {
        System.out.println("工人正在学习");
    }

    @Override
    public void eat() {
        System.out.println("工人正在吃饭");
    }

    @Override
    public void run() {
        System.out.println("工人正在跑步");
    }
}
