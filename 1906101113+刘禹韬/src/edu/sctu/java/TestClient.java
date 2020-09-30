package edu.sctu.java;

import edu.sctu.java.day0916.Person;

public class TestClient {


    public static void main(String[] args) {

        Person p2 = new Person();

        System.out.println(p2.name);

        //隔包 无法调用protected和不加饰符的属性
        //System.out.println(p2.sex);
        //System.out.println(p2.birthday);
        

    }
}
