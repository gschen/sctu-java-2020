package edu.sctu.java.day0922;

public class client02 {
    public static void main(String[] args) {
        A a = new A();
        a.study();

        a = new B();         //向上转型
        a.study();

        C c = (C) new B();   //向下转型 强制类型转换
        c.study();

    }
}
