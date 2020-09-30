package Demo0929.Demo2;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // key 值
        // value 值
        // 创建简单的map
        Map<Integer,String> mapPerson = new HashMap<Integer, String>();

        // 添加元素
        mapPerson.put(1,"Jack");
        mapPerson.put(2,"Marry");
        mapPerson.put(3,"Tom");

        // 打印map内的元素
        for (Map.Entry<Integer,String> entry : mapPerson.entrySet()){
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
        System.out.println(mapPerson);
    }
}
