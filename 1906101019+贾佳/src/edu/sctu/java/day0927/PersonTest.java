package edu.sctu.java.day0927;

public class PersonTest {
    public static void main(String[] args) {
        Person per = new Person();
        per.name="chalky";
        per.age = 19;

//        Person a = new Person();
//        Person b = new Person();
//        Object [] str =new Object[3];
//        str[0] = a;
//        str[1] = b;
//        str[2] = per;
//
        Person [] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
        }
//        persons[0] = new Person();
        persons[0].name = "John";
//        persons[1] = new Person();
        persons[1].name = "Jack";

//        persons[2] = new Person();
        persons[2].name = "Jerry";


    }
}
