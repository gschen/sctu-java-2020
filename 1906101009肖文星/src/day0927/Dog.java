package day0927;

public class Dog implements AnimalAction {


    @Override
    public void eat() {
        System.out.println("正在吃");
    }

    @Override
    public void sleep() {
        System.out.println("正在睡");
    }
}
