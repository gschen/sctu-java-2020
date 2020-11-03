package edu.sctu.java.day1028;

public class Test01 {

    // 内部类

     static class RunDome implements Runnable{

        @Override
        public void run() {

            System.out.println("实现runnable接口的线程");

        }
    }

    static class MyThread extends Thread{
        @Override
        public void run() {

            System.out.println("继承Thread的类");
        }
    }

    public static void main(String[] args) {

         MyThread t1 = new MyThread();
         Thread t2 = new Thread(new RunDome());

         t1.start();
         t2.start();
    }
}
