package edu.sctu.java.day1007;

public class Person {

    String name;
    int age;
    int ID;

    void getInformation(String name,int age,int ID){

        System.out.println(name+","+age+","+ID);
    }
}
class Student extends Person{

    int number;
    String school;


    void getInformation(String name,int age,int ID,int number,String school){
        System.out.println(name+","+age+","+ID+","+number+","+school);
    }
}
class Client {

    public static void main(String[] args){

        Person person = new Person();
        person.getInformation("陆柯燃",25,955211);

        Student student = new Student();
        student.getInformation("刘雨昕",23,191911,222333,"北电");

    }
}

