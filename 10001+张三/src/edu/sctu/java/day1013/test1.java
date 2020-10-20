package edu.sctu.java.day1013;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<String, Integer>();
        maps.put("年龄",3);
        maps.put("学号",1);

        for (Map.Entry entry : maps.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
