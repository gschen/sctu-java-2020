package demo0915;

public class Person {
    String name;
    int age;
    void study(){
        System.out.println(name+"正在学习");
    }
    void introduction(){
        System.out.println("大家好，我是"+name+",今年"+age+"了。");
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("这是构造函数");
    }

}
