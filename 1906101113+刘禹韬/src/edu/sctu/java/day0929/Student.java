package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1906,"张三");
        map.put(1907,"李四");
        map.put(1908,"赵五");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }


}
