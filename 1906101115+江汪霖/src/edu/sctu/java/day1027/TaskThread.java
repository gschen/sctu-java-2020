package edu.sctu.java.day1027;

import java.util.List;

public class TaskThread implements Runnable {

    List<String> urls;
    String name;

    public TaskThread(String name ,List<String> urls){
        this.name = name;
        this.urls = urls;
    }

    @Override
    public void run() {

        for (String url:this.urls){
            System.out.println(this.name+"-download"+ url);
        }


    }
}
