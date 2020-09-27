package edu.sctu.java.day0927;

public class PersonTest {
    public static void main(String[] args){

        Person zhou = new Person();
        zhou.name="zhou";
        zhou.age=10;

        //数组
        int a = 1;

        //整形数组 int数组
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        //...
        ints[4] = 5;

        //3个人的数组
        Person[] s = new Person[3];
//        s[0] = new Person();
//        s[1] = new Person();
//        s[2] = new Person();
//        s[0].name="zhou";
//        s[1].name="yuan";
//        s[2].name="jie";


        for (int i = 0; i < s.length;i++){
            s[i] = new Person();
        }
        s[0].name="zhou";
        s[1].name="yuan";
        s[2].name="jie";
    }
}
