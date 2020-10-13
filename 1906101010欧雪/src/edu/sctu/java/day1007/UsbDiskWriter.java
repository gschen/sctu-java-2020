package edu.sctu.java.day1007;

public class UsbDiskWriter implements Usb {
    @Override
    public void start() {
        System.out.println("start-1");

    }

    @Override
    public void stop() {
        System.out.println("end-1");

    }
}
