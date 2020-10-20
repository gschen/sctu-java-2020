package edu.sctu.java.day0929;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        int a;
            Integer b;
            //Integer是一个final class
            //key键
            //value值
            Map<String ,Integer> map=new HashMap<String, Integer>();
            map.put("age:",10);
            map.put("height:",175);
            map.put("weight:",100);
            //entry就是一个整体，相当于上面的键值对的值，比如{"age",10}
            for (Map.Entry<String ,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+entry.getValue());
        }


    }
}
