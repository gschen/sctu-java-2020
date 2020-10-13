package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        Person chen = new Person();
        chen.name = "chengs";

        //向集合添加元素
        personList.add(chen);

      //打印集合所有元素
        for (Person p : personList){
            System.out.println(p.name);
        }

    }
}
