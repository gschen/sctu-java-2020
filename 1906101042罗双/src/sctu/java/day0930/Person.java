package sctu.java.day0930;

import java.util.*;

public class Person {

    String name;
    int age;

    public static void main(String[] args) {

        Set<Person> PersonList = new HashSet<Person>();

        Person a = new Person();
        a.name = "a";
        a.age=10;

        PersonList.add(a);

        for (Person p :PersonList){
            System.out.println(p.age);
        }

        Map<String,Integer> list = new HashMap<String, Integer>();

    }

}
