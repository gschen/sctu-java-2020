package edu.sctu.java.day0922;

public class Client01 {
    public static void main(String[] args) {

        Demo01 a = new Demo01();
        a.money = 10000;
        a.car = "大牛";

        Demo02 b = new Demo02();
        b.age = 18;
        b.subject = "英语";

        b.study();
    }
}
