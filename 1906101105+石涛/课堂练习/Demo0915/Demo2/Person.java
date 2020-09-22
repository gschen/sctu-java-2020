package Demo0915.Demo2; // 这个就是包

public class Person {

    // 属性
    String name;
    int age;

    // 构造函数
    Person(){
        System.out.println("这是一个构造函数！");
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // 方法
    void study(){
        System.out.println(name+"正在学习！");
    }

    int add(int a,int b){
        int c;
        c=a+b;
        return c;
    }
}
