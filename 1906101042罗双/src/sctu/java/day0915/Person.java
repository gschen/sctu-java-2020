package sctu.java.day0915;

public class Person {
    //属性
    String name;
    int age;

    Person(){
        System.out.println("这是构造函数");
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;

    }


    //方法
    void study(){
        System.out.println("在学习。");
    }
//    void add(int a,int b){
//        int c;
//        c=a+b;
//        System.out.println(c);
//    }

}
