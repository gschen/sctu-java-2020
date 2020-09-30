package day0927;

import day0923.Work.Person.Person;

public class Client {
    public static void main(String[] args) {

        Person[] persons=new Person[3];

        persons[0]=new Person();
        persons[0].name="张三";
        persons[0].age=13;
        persons[0].getName();
        persons[0].getAge();

        persons[1]=new Person();
        persons[1].name="李四";
        persons[1].age=14;
        persons[1].getName();
        persons[1].getAge();
    }
}
