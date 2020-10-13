package edu.sctu.java.实验二.Test8;

public class Cilent {
    public static void main(String[] args) {
        USB usb = new UsbDiskWriter();
        usb.start();
        usb.stop();
        USB cam = new Camera();
        cam.start();
        cam.stop();
        USB mob = new Mobile();
        mob.start();
        mob.stop();
    }


}
