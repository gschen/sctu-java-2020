package day0929;

import day0915.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        Person w = new Person();

        w.name="wzq";

        list.add(w);

        System.out.println(list.get(0).name);
    }
}