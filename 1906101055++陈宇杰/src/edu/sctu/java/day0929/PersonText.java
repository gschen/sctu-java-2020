package edu.sctu.java.day0929;

import edu.sctu.java.day0927.Person;


import java.util.ArrayList;
import java.util.List;


//数组的集合（处理多个元素）
//List类型

public class PersonText extends Person{
    public static void main(String[] args) {
    Person[] tenPerson = new Person[10];
        //task1
        Person[] tenPersons= new Person[10];
        //task2
        Person[] twPersons = new Person[20];
        //....


        List<Person> PersonList = new ArrayList<Person>();

        Person chen = new Person();
        chen.name="cyj";

        //向集合添加元素
        /*  personList.add(chen);
        PersonList.remove(chen);

         */

        //打印集合所有元素
        for(Person p : PersonList){
            System.out.println(p.name);
        }
    }
}
