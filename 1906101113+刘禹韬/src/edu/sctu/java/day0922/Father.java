package edu.sctu.java.day0922;

public class Father {

    String name;
    int age;

//    public Father(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void drank(){
        System.out.println("父亲经常喝酒");

    }

    public void drank(int a){
        System.out.println("父亲隔了"+a+"天没有喝酒了");
    }

    public void study(){
        System.out.println("父亲学习不上心");
    }

}
