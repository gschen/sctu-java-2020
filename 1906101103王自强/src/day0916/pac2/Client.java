package day0916.pac2;

import day0916.pac1.StudentA;

public class Client {
    public static void main(String[] args) {
        StudentA a=new StudentA();
        //a.height=170;
        //a.hobby="篮球";
        a.name="张三";
        a.setAge(12);
        a.getAge();
    }
}