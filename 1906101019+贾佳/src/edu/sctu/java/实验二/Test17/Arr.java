package edu.sctu.java.实验二.Test17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));
        System.out.println(arr.indexOf(Collections.max(arr)));
        System.out.println(arr.indexOf(Collections.min(arr)));
        for(Integer p:arr){
            sum +=p;
        }
        System.out.println(sum);

    }
}
