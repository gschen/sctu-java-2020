package edu.sctu.java.实验二.Test32;

import java.util.HashMap;
import java.util.Map;

public class ma {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<String, String>();

        maps.put("id","1");
        maps.put("name","张三");
        maps.put("gender","男");
        maps.put("age","25");
        maps.put("love","爱学Java");

        for (Map.Entry<String,String> entry :maps.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        System.out.println(maps.size());
        System.out.println(maps.remove("age"));
        System.out.println(maps.size());
    }
}
