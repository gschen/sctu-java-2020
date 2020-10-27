package edu.sctu.java.day1027;

public class Client {

    public static void main(String[] args) {

//        TaskOne taskOne = new TaskOne();
//        new TaskOne(); //匿名对象

        Thread t1 = new Thread(new TaskOne(25));
        t1.start();   //up or down

        TaskTwo t2 = new TaskTwo(50);
        t2.start();

        Thread t3 = new Thread(new TaskThree(75));
        t3.start();

        Thread t4 = new Thread(new TaskFour(100));
        t4.start();
    }
}
