package edu.sctu.java.day1027;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            String url = "http://www.sctu.edu.cn/" + i;
            urls.add(url);

        }

    }
}
