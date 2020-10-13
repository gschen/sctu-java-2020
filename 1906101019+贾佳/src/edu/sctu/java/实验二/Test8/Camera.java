package edu.sctu.java.实验二.Test8;

public class Camera implements USB{
    @Override
    public void start() {
        System.out.println("Camera正在链接");
    }

    @Override
    public void stop() {
        System.out.println("Camera正在断开");
    }
}
