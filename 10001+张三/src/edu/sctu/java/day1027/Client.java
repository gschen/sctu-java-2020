package edu.sctu.java.day1027;

public class Client {

    public static void main(String[] args) {


//        TaskOne taskOne = new TaskOne();
//        new TaskOne(); // 匿名对象

//
        Thread t1 = new Thread(new TaskOne(10));
        t1.start();// up or down

        TaskTwo t2 = new TaskTwo();
        t2.start();



//        Person chen = new Person();
////        chen.age = 18;
//        chen.setAge(18);
//
//        System.out.println("age = " +chen.getAge());



    }
}
