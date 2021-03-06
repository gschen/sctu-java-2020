package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

    public static void main(String[] args) {
        List<String> urls = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {

            urls.add("u" + i);
        }

        List<String> set1 = urls.subList(0, 25);
        List<String> set2 = urls.subList(25, 50);
        List<String> set3 = urls.subList(50, 75);
        List<String> set4 = urls.subList(75, 100);

        Thread t1 = new Thread(new TaskThreadV2("t1", set1));
        Thread t2 = new Thread(new TaskThreadV2("t2", set2));
        Thread t3 = new Thread(new TaskThreadV2("t3", set3));
        Thread t4 = new Thread(new TaskThreadV2("t4", set4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
