package edu.sctu.java.day0922;

public class Father {

    int age;
    String name;

    void eat(){
        System.out.println("针不戳");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.age = 30;
        f.name = "bob";
        f.eat();
        System.out.println(f.name+":"+f.age);

    }
}
