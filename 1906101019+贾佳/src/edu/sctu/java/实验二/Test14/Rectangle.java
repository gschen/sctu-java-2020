package edu.sctu.java.实验二.Test14;

public class Rectangle extends Shape{
    double len1;
    double len2;
    @Override
    public void getArea() {
        System.out.println(len1*len2);
    }
}
