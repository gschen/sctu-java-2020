package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        Set<Person> personSet=new HashSet<Person>();
        //SET是个interface.implements

        Person chen=new Person();
        chen.name="chen";
        personSet.add(chen);
        personSet.add(chen);
        personSet.add(chen);
        personSet.add(chen);
        personSet.add(chen);
        personSet.add(chen);
        personSet.add(chen);
        //personSet.clear();清除

        for (Person p:personSet){
            System.out.println(p.name);
            System.out.println(personSet.isEmpty());
            //判断是否为空集合.返回布尔值.
        }
    }
}
