package day0923.Work.Usb;

public class UsbDiskWriter implements Usb{
    @Override
    public void start() {
        System.out.println("U盘插入");
    }

    @Override
    public void stop() {
        System.out.println("U盘弹出");
    }
}
