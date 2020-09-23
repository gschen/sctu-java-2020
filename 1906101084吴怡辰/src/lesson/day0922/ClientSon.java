package lesson.day0922;

public class ClientSon {

    public static void main(String[] args) {

        Father W  = new Father();

        W.study();
        W.play();

        Father w = new Son();
        w.study();
        w.play();

        // w对象不能访问Son类里的方法
//        w.eat();

        Son ww = new Son();
        ww.study();
        ww.eat();
        ww.play();
    }
}
