package edu.sctu.java.实验二.Test34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jihe {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<String>();
        lis.add("apple");
        lis.add("grape");
        lis.add("banana");
        lis.add("pear");

        System.out.println("Max"+Collections.max(lis));
        System.out.println("Min"+Collections.min(lis));
        Collections.sort(lis);
        System.out.println(lis);

    }
}
