package 课堂练习03.java;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Person> personSet= new HashSet<>();
        Person kyrie = new Person();
        kyrie.name = "Irying";
        personSet.add(kyrie);
        for (Person p : personSet) {
            System.out.println(p.name);
        }
    }
}
