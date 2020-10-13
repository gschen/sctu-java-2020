package edu.sctu.java.day0916;

public class Person {
    public String name; //表示公共的
    private int age; //表示属性和方法是私有的，不允许本类之外的类访问
    protected int height; //表示受保护的，不允许其他类访问被protected修饰的属性或方法


    private void method(){
        System.out.println("我是private");
    }

    public void method1(){
        System.out.println("我是public");
    }

    protected  void method2(){
        System.out.println("我是protected");
    }

//    public static void main(String[] arges){
//        Person chen = new Person();
//        chen.name = "chen";
//        chen.age = 18;
//        chen.height = 180;
//
//
//    }
}
//标识符：关键词，用户自定义标识符
//final修饰符则这个类不可以被继承


