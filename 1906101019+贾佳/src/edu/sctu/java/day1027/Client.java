package edu.sctu.java.day1027;

public class Client {
    public static void main(String[] args) {

//        TaskOne taskOne = new TaskOne();
//
//        new TaskOne();//匿名对象
        Thread t1 = new Thread(new TaskOne(1,10));
        Thread t2 = new Thread(new TaskOne(11,15));
        Thread t3 = new Thread(new TaskOne(16,20));
        t1.start();
        t2.start();
        t3.start();
    }
}
