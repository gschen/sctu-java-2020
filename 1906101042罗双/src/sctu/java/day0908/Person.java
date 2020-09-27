package sctu.java.day0908;

public class Person {
    //1.属性：姓名，年龄，性别等。
    String name="张三";
    int age=18;
    char sex='男';
    double grade=12.3;


    //2.方法，行为：学习，跑步等
    void study(){
        System.out.println("我在学习。");
    }
    void run(){
        System.out.println("我在跑步。");
    }
    void movie(){
        System.out.println("我正在在看电影。");
    }


    //构造函数
    Person(){
        System.out.println("这是构造函数");
    }

    //ctrl+N 搜索类

}
