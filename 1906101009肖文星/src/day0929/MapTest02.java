package day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String, Integer>();

        map.put("a",1);
        map.put("b",2);

        for (Map.Entry<String,Integer> a:map.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
