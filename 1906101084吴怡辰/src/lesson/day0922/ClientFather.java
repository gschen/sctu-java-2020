package lesson.day0922;

public class ClientFather {
    public static void main(String[] args) {

        Father f = new Father();
        f.play();

        f = new Son();
        f.play();

        f = new Daughter();
        f.play();

    }
}
