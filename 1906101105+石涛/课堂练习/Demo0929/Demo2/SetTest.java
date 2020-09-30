package Demo0929.Demo2;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // 定义集合
        Set<Person> setPersons = new HashSet<Person>();

        // 定义属性
        Person a = new Person();
        a.name="Jack";

        // set的简单应用
        // 添加元素
        setPersons.add(a);
        setPersons.add(a);
        setPersons.add(a); // 集合内的元素不能重复
        // 打印元素
        for (Person i : setPersons){
            System.out.println(i.name);
        }
        // 打印长度
        System.out.println(setPersons.size());
    }
}
