package edu.sctu.java.day1013;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("age",20);
        map.put("name",00);

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
