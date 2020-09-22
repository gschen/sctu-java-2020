package edu.sctu.java.day0922;

public class Son extends Father{


    @Override
    void study() {
        super.study();

        System.out.println("son studing");
    }

    void eat() {

        System.out.println("eating");
    }
}
