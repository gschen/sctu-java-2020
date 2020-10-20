package edu.sctu.java.day1013;

public class Student implements GetMethod{

    String name;

    @Override
    public void getname() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        GetMethod s = new Student();
        s.getname();
    }
}
