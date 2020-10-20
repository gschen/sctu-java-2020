package edu.sctu.java.day1007;

public class Camera implements Usb {
    @Override
    public void start() {
        System.out.println("start-2");
    }

    @Override
    public void stop() {
        System.out.println("end-2");

    }
}
