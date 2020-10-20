package edu.sctu.java.day0915;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Client {
    public static void main(String[] args) {

       Person p1 = new Person("李四",20);
       // p1.age = 20;
       // p1.name = "李四";

        p1.study();
        System.out.println(p1.add(1,2));
        System.out.println(p1.name);

        Student sctuer = new Student();
        sctuer.study();
    }
}
