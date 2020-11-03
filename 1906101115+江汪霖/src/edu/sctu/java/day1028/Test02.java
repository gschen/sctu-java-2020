package edu.sctu.java.day1028;

public class Test02 {

    static class PrintThread implements Runnable{

        @Override
        public void run() {

            String tname = Thread.currentThread().getName();
            System.out.println(tname + "-hello,world!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrintThread(),"t1");
        Thread t2 = new Thread(new PrintThread(),"t2");
        Thread t3 = new Thread(new PrintThread(),"t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();

    }
}
