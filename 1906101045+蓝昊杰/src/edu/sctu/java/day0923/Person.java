package edu.sctu.java.day0923;

public class Person implements GetMethod{

    int id;
    int age;
    String name;

    @Override
    public void getname() {
        name = "bob";
        System.out.println(name);
    }

    @Override
    public void getid() {
        id = 666666;
        System.out.println(id);
    }

    @Override
    public void getage() {
        age = 18;
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.getname();
        p.getid();
        p.getage();
    }
}
