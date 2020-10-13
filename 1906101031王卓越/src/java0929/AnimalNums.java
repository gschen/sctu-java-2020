package java0929;

import java.util.*;

public class AnimalNums {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("dog");
        animal.add("cat");
        animal.add("dog");
        animal.add("dog");
        HashMap<String, Integer> m = new HashMap<>();
        for (String value: animal){
            if (m.get(value) != null){
                int k = m.get(value) + 1;
                m.replace(value, k);
            }else {
                m.put(value, 1);
            }
        }
        System.out.println(m);
    }

}
