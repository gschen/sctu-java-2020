package edu.sctu.java.day1013;

public class Vegetable extends Food{

    void eat(){
        System.out.println("Eating "+this.name);
    }

    public static void main(String[] args) {
        Vegetable vegetable=new Vegetable();
        vegetable.name="huluobo";
        vegetable.eat();
    }
}
