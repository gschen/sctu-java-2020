package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //int 和 Integer(是一个类)
//        int a;
//        Integer b;

        //Key值   String
        //alue值  Integer
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("age",10);
        map.put("age",10);
        map.put("age",10);
        map.put("height",175);
        map.put("weight",100);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +","+ entry.getValue());
        }


    }
}
