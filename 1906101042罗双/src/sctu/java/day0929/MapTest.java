package sctu.java.day0929;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

//        int 和 Integer  ctrl+x 剪切
//        int a;
//        Integer b;
//
//        key 键
//        value 值

        Map<String,Integer> map1 = new HashMap<String,Integer>();
        map1.put("age",10);
        map1.put("height",188);
        map1.put("weight",10);

        for (Map.Entry<String,Integer> entry :map1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

//        map的作用  dog bird fish dog fish cat cat



    }
}
