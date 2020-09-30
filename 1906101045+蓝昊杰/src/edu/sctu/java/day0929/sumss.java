package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class sumss {

    void sums(){

        Map<String,Integer> maps = new HashMap<String, Integer>();

        String[] animals = {"dog","dog","dog","cat","cat","cat","fish","fish"};

        for (String i :
                animals) {
            if (maps.containsKey(i)) {
                maps.put(i, maps.get(i) + 1);
            } else {
                maps.put(i, 1);
            }
        }
        System.out.println(maps);
    }


    public static void main(String[] args) {

        sumss m = new sumss();
        m.sums();
        }
}


