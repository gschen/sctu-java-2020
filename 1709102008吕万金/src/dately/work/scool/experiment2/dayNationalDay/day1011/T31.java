package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.ArrayList;
import java.util.List;

public class T31 {
    public static void main(String[] args) {
//        创建列表
        List<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("马六");
        list.add("赵七");

//        打印
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i+":"+list.get(i));
        }

//        删除和长度
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list.get(2));
        System.out.println(list.size());

    }
}

