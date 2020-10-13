package 实验二;

import java.util.HashMap;
import java.util.Map;

public class Test32 {
    public static void main(String[] args) {
        // 创建map
        Map<String,String> person = new HashMap<String, String>();

        // 添加元素
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱学java");

        // 打印元素
        for (Map.Entry<String,String> entry : person.entrySet()){
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }

        // 删除操作
        System.out.println(person.size());
        System.out.println(person.remove("age"));
        System.out.println(person.size());
    }
}
