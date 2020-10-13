package 实验二.Usb;

public class Camera implements Usb{
    @Override
    public void start() {
        System.out.println("相机usb链接");
    }

    @Override
    public void stop() {
        System.out.println("相机usb弹出");
    }
}
