package edu.sctu.java.day0929;


//Map作用

import java.util.HashMap;
import java.util.Map;

public class MapText {
    public static void main(String[] args) {


        //int 和 Integer
        int a;
        Integer b;

        //key键
        //value 值

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("age",10);
        map.put("height",175);
        map.put("weight",100);


        for (Map.Entry<String,Integer> Entry:map.entrySet()){
            System.out.println(Entry.getKey()+","+Entry.getValue());
        }

    }
}
