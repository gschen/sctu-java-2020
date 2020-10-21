package edu.sctu.java.test;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {

        // iterator的好处就在于采用了统一的方式去遍历集合所有元素。
        // iterator是一种比较高层次的抽象。
        Set<String> set = new HashSet<>();
        set.add("chen");

        for (Iterator<String> iter = set.iterator(); iter.hasNext(); ) {
            String s = iter.next();
            System.out.println(s);
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("test", 1);

        for (Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); iter.hasNext(); ) {

            Map.Entry<String, Integer> entry = iter.next();

            System.out.println(entry.getKey() + entry.getValue());
        }


        List<String> stringList = new ArrayList<String>();

        stringList.add("hello");
        stringList.add("hello");
        stringList.add("hello");
        stringList.add("hello");


        for (Iterator<String> iter = stringList.iterator(); iter.hasNext(); ) {

            String s = iter.next();
            System.out.println(s);
        }

    }
}
