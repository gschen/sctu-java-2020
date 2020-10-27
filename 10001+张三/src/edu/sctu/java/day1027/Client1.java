package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class Client1 {

    public static void main(String[] args) {
        List<String> urls = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {

            urls.add("u" + i);
        }

        Thread t = new Thread(new TaskThreadV2(urls));
        t.start();
    }
}
