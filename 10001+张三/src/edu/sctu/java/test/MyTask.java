package edu.sctu.java.test;

import java.util.List;

public class MyTask implements Runnable {

    List<String> urls;
    String name;

    public MyTask(String name, List<String> urls) {
        this.name = name;
        this.urls = urls;
    }

    @Override
    public void run() {
        try {
            for (String url : urls) {
                Thread.sleep(100);
                System.out.println(String.format("%s - Downloading %s", name, url));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
