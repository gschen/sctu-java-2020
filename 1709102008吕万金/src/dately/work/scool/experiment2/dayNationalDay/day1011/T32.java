package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.HashMap;
import java.util.Map;

public class T32 {
    public static void main(String[] args) {
        Map<String,String> person =new HashMap<String,String>();
        person.put("id","1");
        person.put("name","张三");
        person.put("gender","男");
        person.put("age","25");
        person.put("love","爱学java");

//        打印：
        for (Map.Entry<String,String>entry:person.entrySet()){
            System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue());
        }

        //删除、返回长度
        System.out.println("开始的长度:"+person.size());
        System.out.println("删除age:"+person.remove("age"));
        System.out.println("现在的长度:"+person.size());

    }
}

