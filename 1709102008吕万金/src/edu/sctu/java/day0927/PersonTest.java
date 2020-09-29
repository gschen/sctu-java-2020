package edu.sctu.java.day0927;

public class PersonTest {

    public static void main(String[] args) {
        int size=3;
        Person[] persons=new Person[size];

        for (int i = 0; i < 3; i++) {
            persons[i]=new Person();
        }
        persons[0].name="zhang";
        persons[1].name="san";
        persons[2].name="li";
//int和String这种就不需要实例化了，如果是类似于这个java文件就需要实例化出来。
    }
}
