package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T8 {
    static class UsbDiskWriter implements Usb{
        @Override
        public void start() {

        }
        @Override
        public void stop() {

        }
    }
    static class Camera implements Usb{
        @Override
        public void start() {

        }
        @Override
        public void stop() {

        }
    }
    static class Mobile implements Usb{
        @Override
        public void start() {

        }
        @Override
        public void stop() {

        }
    }

    public static void main(String[] args) {
        Camera camera=new Camera();
        camera.start();
        camera.stop();

        UsbDiskWriter usbDiskWriter=new UsbDiskWriter();
        usbDiskWriter.start();
        usbDiskWriter.stop();

        Mobile mobile=new Mobile();
        mobile.start();
        mobile.stop();
    }
}
