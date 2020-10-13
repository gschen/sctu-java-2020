package edu.sctu.java.实验二.Test8;

public class UsbDiskWriter implements USB{

    @Override
    public void start() {
        System.out.println("正在连接");
    }

    @Override
    public void stop() {
        System.out.println("正在断开");
    }
}
