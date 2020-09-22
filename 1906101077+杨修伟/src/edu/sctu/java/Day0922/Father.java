package edu.sctu.java.Day0922;

public class Father {

    int age;
    String name;

    void say(){
        System.out.println("父亲说hahhahhahahh");
    }


    public static void main(String[] args) {
        Father yang = new Father();

        yang.age = 18;
        yang.name = "yang";
        yang.say();
    }
}
