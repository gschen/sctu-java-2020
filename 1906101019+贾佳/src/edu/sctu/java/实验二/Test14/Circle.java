package edu.sctu.java.实验二.Test14;

public class Circle extends Shape{
    double radius;
    @Override
    public void getArea() {
        System.out.println(2*radius*Math.PI);
    }
}
