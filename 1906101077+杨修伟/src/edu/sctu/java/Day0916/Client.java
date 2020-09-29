package edu.sctu.java.Day0916;

public class Client {
    public static void main(String[] args) {
        PersonB a = new PersonB();
        a.name = "yang";
    //    a.age = 18;//私有
        a.height = 50;//protected修饰，同一个包可调用

    }

}
