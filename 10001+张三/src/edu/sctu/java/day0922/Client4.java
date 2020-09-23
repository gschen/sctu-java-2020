package edu.sctu.java.day0922;

import java.lang.reflect.AnnotatedArrayType;

public class Client4 {

    public static void main(String[] args) {






        Bird b = new Bird();
        b.eat();

        (new Bird()).eat();





        Bird c = new Bird();
        Animal a = c;

        // 匿名对象
        Animal aa = new Bird(); // 向上转型


        Cat cat = (Cat) new Animal(); //alt +　enter

        Bird bird = (Bird) new Animal();

    }
}
