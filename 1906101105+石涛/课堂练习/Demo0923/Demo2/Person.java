package Demo0923.Demo2;

public class Person implements PersonAction{
    // 属性
    String name;
    int age;

    // 接口的方法
    // 重写方法
    @Override
    public void study() {
        System.out.println("Studying...");
    }

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep...");
    }
}
