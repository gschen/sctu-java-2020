package edu.sctu.java.day0930;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("mom",30);
        map.put("dad",32);
        map.put("son",10);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
