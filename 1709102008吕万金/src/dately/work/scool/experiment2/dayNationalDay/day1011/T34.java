package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T34 {
    public static void main(String[] args) {
        //创建列表
        List<String> fruits = new ArrayList<String>();

        fruits.addAll(0, Arrays.asList("apple","grape","banana","pear"));

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
        Collections.sort(fruits); //升序排序
        System.out.println(fruits);

    }
}
