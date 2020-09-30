package 课堂练习03.java;


import java.util.HashMap;
import java.util.Map;

public class MapTest {
    /**public static void main(String[] args) {
        //key 键
        // value 值
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("kyrie",20);
        map.put("kk",20);
        for (Map.Entry<String,Integer> entry:map.entrySet());
        System.out.println(entry.getKey());

    Map<String, Integer> plane = new HashMap<String, Integer>();
    plane.put("启动",1);
    plane.put("关闭",2);
    plane.put("运行",3);
    plane.put("向上",u);
    plane.put("向下",d);
    plane.put("想左",l);
    plane.put("向右",r);
    plane.put("退出",q);
    for (Map.Entry<String,Integer> entry:map.entrySet());
        System.out.println(entry.getKey());
}
}

*/
    public static <AttributeEntry> void main(String[] args) {
        //key键      //value值
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Kyrie",20);
        map.put("Iring",20);
        for (Map.Entry<String,Integer> entry:map.entrySet());
        AttributeEntry entry = null;
        System.out.println(map);
    }
}