package edu.sctu.java.day0916;

import edu.sctu.java.day0915.Client;

public class PersonA extends ClientA{
    public String name;
    private  int age;
    protected int height;

    public static void main(String[] args) {
        PersonA a = new PersonA();
        ClientA  c = new ClientA();
        c.age = 20;
        a.age = 18;
        a.height = 175;
        a.name = "Bob";
    }


}
