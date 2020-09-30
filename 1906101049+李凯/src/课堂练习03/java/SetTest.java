package 课堂练习03.java;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<Person>();
        Person Jiang = new Person();
        Jiang.name = "FF";
        personSet.add(Jiang);
        for (Person p : personSet){
            System.out.println(p.name);
        }
    }
}
