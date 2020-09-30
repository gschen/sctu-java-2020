package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args){

        // int 和 Integer的区别
        int a;
        Integer b;

        //key 键
        //value 值

        Map<String, Integer> map = new HashMap<String,Integer>();

        map.put("age",18);
        map.put("height",185);
        map.put("weight",135);

        for (Map.Entry<String,Integer> entry : map.entrySet()){

            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
