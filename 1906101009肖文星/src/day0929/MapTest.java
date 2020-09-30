package day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("a","1");
        map.put("b","2");

        for (Map.Entry<String,String> a:map.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
