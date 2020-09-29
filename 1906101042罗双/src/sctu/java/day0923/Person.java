package sctu.java.day0923;

public class Person implements PersonAction {    //alt+enter

    String name;
    int age;


    @Override
    public void study() {
        System.out.println("person正在学习！");
    }

    @Override
    public void play() {
        System.out.println("person正在玩！");
    }

    @Override
    public void eat() {
        System.out.println("person正在吃饭！");
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.eat();
    }
}
