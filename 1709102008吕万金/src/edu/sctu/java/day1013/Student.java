package edu.sctu.java.day1013;

public class Student implements PersonMethod{
    @Override
    public void run() {

    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void say() {

    }

    public static void main(String[] args) {
        PersonMethod personMethod=new Student();//用接口去实例化类。
        personMethod.eat();
    }
}
