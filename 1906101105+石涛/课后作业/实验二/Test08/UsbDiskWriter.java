package 实验二.Test08;

public class UsbDiskWriter implements Usb{
    // 重写方法
    @Override
    public void start() {
        System.out.println("Using usb.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping using usb.");
    }
}
