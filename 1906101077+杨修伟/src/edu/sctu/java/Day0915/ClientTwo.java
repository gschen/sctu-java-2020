package edu.sctu.java.Day0915;

import edu.sctu.java.Day0916.PersonB;

public class ClientTwo {
    public static void main(String[] args) {
        Student yang = new Student();
        yang.age =18;
        yang.name = "yang";
        yang.study();
        yang.eat();
// PersonB 中 height 用 protected 修饰，同一个包内可调用，不同包无法调用，age用pravit修饰，私有变量不能调用,name用public修饰，都可调用
//        PersonB a = new PersonB();
//        a.height = 50;
//        a.age = 18;
//        a.name = "yang";
    }
}
