package edu.sctu.java.day1027;

public class Client {
    public static void main(String[] args) {

//        TaskOne taskOne = new TaskOne();
//
//        new TaskOne();//匿名对象
        Thread t1 = new Thread(new TaskOne(10));

        t1.start();

    }
}
