package 课堂练习03.java;

import java.util.ArrayList;
import java.util.List;

public class Personone<li, personList> {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        //数组
        persons[0] = new Person();
        persons[0].name = "a";
        persons[1] = new Person();
        persons[1].name = "b";
        persons[2] = new Person();
        persons[2].name = "c";

        //集合
        List<Person> personList = new ArrayList<>();
        Person li = new Person();
        li.name = "kk";
        //向集合添加元素
        personList.add(li);
        personList.remove(li);
        //打印集合所有元素
        for (Person p : personList) {
            System.out.println(p.name);
        }


    }
}


