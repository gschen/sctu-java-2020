package edu.sctu.java.day0927;

public class PersonTest1 {

    public static void main(String[] args) {

        Person person = new Person();
        String[] strs = {"zhou", "yuan", "jie"};
        person.name = strs[0];
        person.name = strs[1];
        person.name = strs[2];
        System.out.println(strs[0]+" "+strs[1]);
    }
}
