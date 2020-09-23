package lesson.day0923;

public class Worker implements PersonAction{

    @Override
    public void play() {
        System.out.println("工作");
    }


    public static void main(String[] args) {

        PersonAction w = new Worker();
        w.play();
    }

}
