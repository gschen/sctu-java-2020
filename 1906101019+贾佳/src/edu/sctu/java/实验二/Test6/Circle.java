package edu.sctu.java.实验二.Test6;

public class Circle {
    double len;
    Circle(double l){
        this.len = l;

    }
    Circle(){

    }
    void getSquare(){
        System.out.println(Math.PI*Math.pow(this.len,2));
    }
    void getLen(){
        System.out.println((2*this.len)*Math.PI);
    }
}
