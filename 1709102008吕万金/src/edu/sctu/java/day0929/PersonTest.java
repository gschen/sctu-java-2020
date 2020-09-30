package edu.sctu.java.day0929;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person[] tenPersons=new Person[10];

        List<Person> personList=new ArrayList<Person>();
        Person chen=new Person();
        chen.name="chen";
        Person cd=new Person();
        cd.name="zhang";

        personList.add(chen);
        personList.add(cd);
        personList.add(cd);
        personList.add(cd);
        personList.add(cd);//ctrl+d重复该行代码
//        personList.remove(chen);


        for (Person p:personList){
            System.out.println(p.name);
        }
    }
}
