package java0929;

import java.util.*;

public class Setmethod {
    public static void main(String[] args) {
        Set<Integer> e = new HashSet<Integer>();
        e.add(1);
        e.add(2);
        e.add(3);
        for(Integer value: e){
            System.out.println(value);
        }
    }
}
