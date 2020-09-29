package Demo0929.Demo2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 创造一个Person列表
        List<Person> persons = new ArrayList<Person>();

        // 定义属性
        Person a = new Person();
        a.name="A";
        Person b = new Person();
        b.name="B";
        Person c = new Person();
        c.name="C";

        // List的简单操作
        // 添加
        persons.add(a); // ctrl + D 复制上一行到下一行
        persons.add(b);
        persons.add(c);
        // 删除
        persons.remove(c);
        persons.add(c);
        // 打印列表内所有元素
        for (Person i : persons){
            System.out.println(i.name);
        }
    }
}
