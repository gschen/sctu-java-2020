package Demo0916.Demo1;

public class Person {

    // 属性
    String name;
    String sex;
    int age;

    // 构造方法
    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // 方法
    void eat(){
        System.out.println("吃饭");
    }

    void sleep(){
        System.out.println("睡觉");
    }
}
