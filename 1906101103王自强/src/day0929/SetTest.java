package day0929;

import day0915.Person;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<Person>sets=new HashSet<Person>();

        Person w= new Person();

        w.name="wzq";

        sets.add(w);
        sets.add(w);
        sets.add(w);
        sets.add(w);

        for(Person p :sets){
            System.out.println(p.name);
        }

    }
}
