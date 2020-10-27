package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class TaskThread implements Runnable {
    @Override
    public void run() {
        List<String> urls = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {

            urls.add("u" + i);
        }


        for (String url : urls) {

            System.out.println("Download " + url);

        }
    }
}
