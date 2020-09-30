package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {


        String[] strings = new String[6];


        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("king", 4);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey());

        }


    }
}
