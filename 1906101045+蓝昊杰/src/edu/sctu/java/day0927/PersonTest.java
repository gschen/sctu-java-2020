package edu.sctu.java.day0927;

public class PersonTest {

    public static void main(String[] args) {
        PersonTest p = new PersonTest();
        Person[] persons = new Person[3];

        for(int i=0;i<persons.length;i++){
            persons[i] = new Person();
        }
        persons[0].name = "a";
        persons[1].name = "b";
        persons[2].name = "c";
    }

}
