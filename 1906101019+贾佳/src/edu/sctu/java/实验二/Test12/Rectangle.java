package edu.sctu.java.实验二.Test12;

public class Rectangle extends Shape{
    double len1;
    double len2;
    @Override
    void Perimeter(){
        System.out.println(len1+len2);
    }
    @Override
    void Area(){
        System.out.println(len1*len2);
    }
}
