package edu.sctu.java.实验二.Test12;

public class Circle extends Shape{
    double radius;
    @Override
    void Perimeter(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
    void Area(){
        System.out.println(2*radius*Math.PI);
    }
}
