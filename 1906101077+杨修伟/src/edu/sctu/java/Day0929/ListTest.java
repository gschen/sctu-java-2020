package edu.sctu.java.Day0929;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    String name;
    public static void main(String[] args) {
        List<ListTest> teacherList = new ArrayList<ListTest>();
        ListTest yang = new ListTest();
        ListTest lan = new ListTest();
        ListTest a = new ListTest();
        yang.name = "yangs";
        lan.name = "lans";
        a.name = "yangs";

//向集合添加删除元素
        teacherList.add(yang);//
        teacherList.add(yang);//CTRL+D  复制整行   三个人是不同的对象
        teacherList.add(yang);
        teacherList.add(lan);
        teacherList.add(a);
        //teacherList.remove(yang);
// 打印集合所有元素
        for (ListTest p : teacherList) {
            System.out.println(p.name);
        }
    }

}


