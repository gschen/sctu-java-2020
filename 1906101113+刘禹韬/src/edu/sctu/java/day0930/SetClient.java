package edu.sctu.java.day0930;

import java.util.HashSet;
import java.util.Set;

public class SetClient {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<Person>();

        Person p1 = new Person();
        p1.name = "阿伟";

        Person p2 = new Person();
        p2.name = "杰哥";



        people.add(p2);
        people.add(p1);

        for (Person p : people ){
            p.work();
        }

    }

}
