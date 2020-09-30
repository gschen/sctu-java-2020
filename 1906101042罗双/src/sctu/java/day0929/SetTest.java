package sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<Person>();
        Set<Person> personSet1 = new HashSet<Person>();

        Person luo = new Person();
        luo.name="luoshuang";
        luo.age=18;

        personSet.add(luo);
        personSet.add(luo);



        for (Person p:personSet){
            System.out.println(p.age);
        }

        System.out.println(personSet.size());   //
        System.out.println(personSet.isEmpty()); //是否为空

    }

}
