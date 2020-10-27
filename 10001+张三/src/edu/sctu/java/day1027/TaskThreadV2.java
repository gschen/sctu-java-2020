package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class TaskThreadV2 implements Runnable {

    List<String> urls;
    String name;

    public TaskThreadV2(String name, List<String> urls) {
        this.name = name;
        this.urls = urls;
    }

    public TaskThreadV2(List<String> urls) {
        this.name = name;
        this.urls = urls;
    }


    @Override
    public void run() {

        for (String url : this.urls) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.name +" - Download " + url);

        }
    }
}
