package java0929;
import java.util.*;


public class Client {

    public static  void main(String[] args) {
        Person[] persons = new Person[3];
        List<String> li = new ArrayList<String>();
        li.add("Bob");
        li.add("Lili");
        li.add("Alice");
        List<Integer> lin = new ArrayList<Integer>(); //Integer列表元素的属性为int
        lin.add(5);
        lin.add(6);
        lin.add(7);
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            persons[i].name = li.get(i);
            persons[i].age = lin.get(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(persons[i].name + ":" + persons[i].age);
        }

    }
}
