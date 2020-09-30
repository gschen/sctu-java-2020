package sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

//        Person a = new Person();
//        a.name="a";
//        a.age=10;
//
//        Person[] persons = new Person[2];
//
//        for (int i=0;i<2;i++){
//            persons[i] = new Person();
//        }
//
//        persons[0].age=10;
//        persons[1].age=5;


        List<Person> personList = new ArrayList<Person>();
        List<Person> personList1 = new ArrayList<Person>();
        Person luo = new Person();
        luo.age=10;
        luo.name="luoshuang";

        Person a = new Person();
        a.name="a";
        a.age=12;

//        向集合添加元素     ctrl+d  复制一行
        personList.add(luo);
//        personList.remove(luo);

//        打印集合所有元素
        for (Person p : personList){
            System.out.println(p.name);
        }


    }
}
