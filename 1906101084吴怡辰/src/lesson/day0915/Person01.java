package lesson.day0915;

public class Person01 {

    String name;
    int age;

    void study(){
        System.out.println("正在学习");
    }


    //构造函数 ，一个类可以有多个构造函数
    Person01(){
        System.out.println("这是构造函数");
    }

    //初始化类的一些属性
    Person01(String name, int age){

        this.name = name;
        this.age = age;

    }


    int add(int a,int b){

        int c;
        c = a + b;
        return c;

    }

//    public static void main(String[] args) {
//        Person01 p = new Person01();
//        p.add(2,4);
//    }

}
