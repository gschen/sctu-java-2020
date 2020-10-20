package edu.sctu.java.实验二.Test11;

public class Rectangle implements printx{
    double len1;
    double len2;
    double Square(){
        return len1*len2;
    }
    double length(){
        return len1+len2;
    }

    @Override
    public void printMyWay() {
        System.out.println(length());
        System.out.println(Square());
    }
}
