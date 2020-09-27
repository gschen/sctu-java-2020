package edu.sctu.java.day0927;

public class PersonTest {
    public static void main(String[] args) {
        Person per = new Person();
        per.name="chalky";
        per.age = 19;

        Person a = new Person();
        Person b = new Person();
        Object [] str =new String[3];
        str[0] = a;
        str[1] = b;
        str[2] = per;

    }
}
