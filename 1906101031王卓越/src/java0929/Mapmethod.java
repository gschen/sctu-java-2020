package java0929;

import java.util.*;

public class Mapmethod {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Bob", 16);
        m.put("Alice", 17);
        m.put("Lili", 18);
        System.out.println(m);
        for (Map.Entry<String, Integer> e: m.entrySet()){ //遍历字典
            System.out.println(e);
        }
    }
}
