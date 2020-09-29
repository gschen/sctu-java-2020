package edu.sctu.java.day0929;

import java.util.*;

public class AnimalTest {
    public static void main(String[] args) {
        List<String > list=new ArrayList<String >();

        list.add("dog");
        list.add("bird");
        list.add("fish");
        list.add("dog");
        list.add("fish");
        list.add("cat");
        list.add("cat");

        Set uniqueSet=new HashSet(list);
        for (Object temp:uniqueSet){
            System.out.println(temp+":"+ Collections.frequency(list,temp));

        }
    }
}
