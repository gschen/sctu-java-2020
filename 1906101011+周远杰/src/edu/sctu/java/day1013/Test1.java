package edu.sctu.java.day1013;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map <String,Integer> map = new HashMap<String,Integer>();
        map.put("学号",1906101011);
        map.put("班号",1903);

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
