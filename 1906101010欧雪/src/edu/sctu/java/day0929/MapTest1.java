package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<String,Integer>();


        map.put("age:",10);
        map.put("height:",100);
        map.put("weight:",200);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }


    }
}
