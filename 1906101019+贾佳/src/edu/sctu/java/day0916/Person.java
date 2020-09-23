package edu.sctu.java.day0916;

public class Person {
    public int age;
    private String name;
    protected int height;
    Person(){

    }

    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    protected void Sleep(){
        System.out.println("正在睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person per = new Person();
        per.height=10;
    }
}
