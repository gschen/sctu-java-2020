package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        int a ;
        Integer b;


        Map<String ,Integer> map = new HashMap<String, Integer>();

        map.put("age",10);
        map.put("height",180);
        map.put("weight",100);

        for (Map.Entry<String ,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
