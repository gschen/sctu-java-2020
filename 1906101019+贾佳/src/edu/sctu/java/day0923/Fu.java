package edu.sctu.java.day0923;

public class Fu {
    int age;
    String name;
    void rest(){
        System.out.println("父类正在休息");

    }

    void learn(String sub){
        System.out.println("正在学习"+sub);
    }
    void learn(String sub,int time){
        System.out.println("正在学习"+sub+"已经学习了"+time+"分钟了");
    }
}
