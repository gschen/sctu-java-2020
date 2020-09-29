package sctu.java.day0927;

public class Person implements PersonAction {
    String name;
    int age;
    @Override
    public void study() {

        System.out.println("在学习！");
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {

    }

    public static void main(String[] args) {
        Person a = new Person();
        a.study();
    }
}
