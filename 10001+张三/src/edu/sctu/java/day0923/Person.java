package edu.sctu.java.day0923;

import edu.sctu.java.day0916.PersonA;

public class Person implements PersonAction {//alt+enter

    String name;
    int age;


    @Override
    public void study() {
        System.out.println("普通人正在学习!");
    }
}
