package edu.sctu.java.day0915;

public class text3 {
    String name ="dogone";
    void eat(){
        System.out.println("apple");
    }
    void play(){
        System.out.println("ball");

    }

    public static void main(String[] args) {
        System.out.println();
        text3 dog=new text3() ;
        dog.name="one";
        dog.eat();
        dog.play();

    }
}
