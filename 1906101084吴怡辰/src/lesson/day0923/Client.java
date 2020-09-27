package lesson.day0923;

public class Client {

    public static void main(String[] args) {

        PersonAction a = new Person();
        a.play();

        PersonAction b = new Worker();
        b.play();

    }
}
