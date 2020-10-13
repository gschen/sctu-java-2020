package edu.sctu.java.实验二.Test8;

public class Mobile implements USB{
    @Override
    public void start() {
        System.out.println("Mobile正在连接");
    }

    @Override
    public void stop() {
        System.out.println("Mobile正在断开");
    }
}
