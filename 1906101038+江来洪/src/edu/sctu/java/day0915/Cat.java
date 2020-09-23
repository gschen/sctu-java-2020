package edu.sctu.java.day0915;

public class Cat {
    String variety;
    int age;
    int weight;
    String coatColor;
    String sex;
    void sleep(){
        System.out.println("正在睡觉");
    }
    void eat(){
        System.out.println("正在吃猫粮");
    }
    void play(){
        System.out.println("在玩逗猫棒");
    }
    public static void main(String[] args) {
        Cat kiwi = new Cat();
        kiwi.variety = "布偶";
        kiwi.age = 3;
        kiwi.weight = 8;
        kiwi.coatColor = "灰白相间";
        kiwi.sex = "公";
        System.out.println("品种："+kiwi.variety);
        System.out.println("年龄："+kiwi.age);
        System.out.println("体重："+kiwi.weight+"kg");
        System.out.println("毛色："+kiwi.coatColor);
        System.out.println("性别："+kiwi.sex);
        kiwi.sleep();
        kiwi.eat();
        kiwi.play();
    }
}
