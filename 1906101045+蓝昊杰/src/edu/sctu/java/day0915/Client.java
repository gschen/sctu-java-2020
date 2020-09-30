package edu.sctu.java.day0915;

import edu.sctu.java.day0916.PersonA;

public class Client {
    public static void main(String[] args) {

        Person lan = new Person();
        PersonA a = new PersonA();
        lan.study();
        a.name = "Bob";
    }
}
