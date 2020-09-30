package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Hi");
//        第一种遍历方法使用For-Each遍历List
        for (String str:list){
            System.out.println(str);
        }
    }
}
