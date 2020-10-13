package edu.sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class Plane {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        map.put("启动","start");
        map.put("关闭","close");
        map.put("运行","operation");
        map.put("向上","up");
        map.put("向下","down");
        map.put("向左","left");
        map.put("向右","right");

//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getKey());
            System.out.println(map.get("向上"));
            System.out.println(map.get("向下"));
//        }
    }
}
