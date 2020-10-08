package 实验二;

import java.util.*;

public class Test34 {
    public static void main(String[] args) {
        // 创建列表
        List<String> fruits = new ArrayList<String>();

        // 添加元素
        fruits.addAll(0, Arrays.asList(new String[]{"apple", "grape", "banana", "pear"}));

        // 求最大
        String ans = null;
        int a = 0;
        for (String i : fruits){
            int b=i.length();
            if (b>a){
                ans = i;
                a=b;
            }
        }
        System.out.println(ans);

        // 排序打印
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
