package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

    public static void main(String[] args) {

        List<String> urls = new ArrayList<String>();

        for (int i = 0; i <100 ; i++) {
            urls.add("u" +i);
        }

        List<String> set1 = urls.subList(0,25);
        List<String> set2 = urls.subList(26,50);
        List<String> set3 = urls.subList(51,75);
        List<String> set4 = urls.subList(76,100);


        Thread t1 = new Thread(new TaskThread("t1",set1));
        Thread t2 = new Thread(new TaskThread("t2",set1));
        Thread t3 = new Thread(new TaskThread("t3",set1));
        Thread t4 = new Thread(new TaskThread("t4",set1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
