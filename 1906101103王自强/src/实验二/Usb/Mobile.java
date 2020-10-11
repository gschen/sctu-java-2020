package 实验二.Usb;

public class Mobile implements Usb{
    @Override
    public void start() {
        System.out.println("手机usb链接");
    }

    @Override
    public void stop() {
        System.out.println("手机usb弹出");
    }
}
