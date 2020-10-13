package edu.sctu.java.实验二.Test31;

import java.util.ArrayList;
import java.util.List;

public class arrlist {
    public static void main(String[] args) {
        int index=0;
        List<String> names = new ArrayList<String>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("马六");
        names.add("赵七");

        for (String n: names){
            index++;
            System.out.println(n);
            System.out.println(index);

        }
        System.out.println(names.size());

        System.out.println(names.remove(2));
        System.out.println(names.get(2));
        System.out.println(names.size());

    }
}
