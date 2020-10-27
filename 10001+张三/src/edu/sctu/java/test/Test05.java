package edu.sctu.java.test;

import java.util.ArrayList;
import java.util.List;

public class Test05 {


    public static void main(String[] args) {

//        Thread t1 = new Thread(new MyTask());
//        t1.start();

        List<String> urlList = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            urlList.add(String.format("http://www.sctu.edu.cn/%d", i));
        }

        List<String> u1 = urlList.subList(0, 30);
        List<String> u2 = urlList.subList(30, 60);
        List<String> u3 = urlList.subList(60, 100);

        Thread t1 = new Thread(new MyTask("u1", u1));
        t1.setName("task1");
        Thread t2 = new Thread(new MyTask("u2", u2));
        Thread t3 = new Thread(new MyTask("u3", u3));

        t1.start();
        t2.start();
        t3.start();
    }
}
