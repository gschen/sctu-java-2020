package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        int a;
        Integer b;
        map.put("age",2);
        map.put("height",175);
        map.put("weght",100);

        for (Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
