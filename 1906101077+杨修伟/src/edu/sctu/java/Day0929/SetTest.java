package edu.sctu.java.Day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    String name;
    public static void main(String[] args) {
        Set<SetTest> personSet = new HashSet<SetTest>();

        SetTest yang = new SetTest();
        yang.name = "yangss";
        personSet.add(yang);
        personSet.add(yang);
        personSet.add(yang);
        personSet.add(yang);//set内同样的对象只会打印一次与list不同,不允许添加重复的对象

        System.out.println(personSet.size());//集合的长度
        System.out.println(personSet.isEmpty());//判断集合是否为空
        System.out.println(personSet.contains(yang));

        for (SetTest p:personSet){
            System.out.println(p.name);
        }
    }
}
