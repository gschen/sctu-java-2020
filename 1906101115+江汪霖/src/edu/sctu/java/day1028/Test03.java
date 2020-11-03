package edu.sctu.java.day1028;

public class Test03 {

    static class Counter{
        int number = 0;

         void increase(){


             synchronized (this){          //对一段代码进行加锁
                 number++;
                 System.out.println(Thread.currentThread().getName() + ">"+number);

                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

        }
    }
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    counter.increase();

                }
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    counter.increase();
                }
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
