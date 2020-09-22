package edu.sctu.java.Day0916;

public class PersonB {
    public String name;
    private int age;
    protected int height;

    void study(){
        System.out.println("在学习");
    }

    public static void main(String[] args) {
        PersonB a = new PersonB();
        a.name = "yang";
        a.age = 18;
        a.height = 175;
    }
}
