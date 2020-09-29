package edu.sctu.java.Day0915;

public class PersonA {
    //CTRL + N 搜索类
    //1.属性：姓名，年龄，性别等。
     String name = "yang";
     int age = 18;

    //2.方法，行为：学习，跑步，看电影等。
    void eat(){

        System.out.println(name+"在吃饭");
    }
    void study(){

        System.out.println(name+"在学习");
    }
    PersonA(){
        System.out.println("这是构造函数");
    }

    PersonA(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        PersonA s = new PersonA();
        System.out.println("学生："+s.name);
        System.out.println(s.name+"今年"+s.age+"岁");
        s.eat();
        s.study();

    }

    /*
    多行注释
     */
}
