package lesson.day0923;

public class Person implements A,B,PersonAction {

    @Override
    public void study() {
        System.out.println("学习");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void play() {
        System.out.println("游戏");
    }

    public static void main(String[] args) {

        Person p = new Person();  //实例化子类对象
        A a = p;  //向上转型
        B b = p;
        PersonAction pa = p;

        a.study();
        b.eat();
        pa.play();


    }

}
