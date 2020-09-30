package edu.sctu.java.day0915;

public class Client {
    public static void main(String[] args){

   /*    Preson zhou=new Preson();
        zhou.name="zhou";
        zhou.age=18;       */

        Preson zhou = new Preson("zhou",18);
        zhou.study();
        System.out.println(zhou.name);
        System.out.println(zhou.add(3,5));
    }
}
