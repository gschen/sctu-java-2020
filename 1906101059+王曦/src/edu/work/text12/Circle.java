package edu.work.text12;

public class Circle extends Shape{

    double radius ;

    @Override
    void getarea() {
        System.out.println(3.14*radius*radius);
    }

    @Override
    void getperimter() {
        System.out.println(3.14*2*radius);
    }
}
