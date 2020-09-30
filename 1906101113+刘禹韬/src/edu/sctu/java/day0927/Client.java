package edu.sctu.java.day0927;

public class Client {
    public static void main(String[] args) {

//        PersonAction s1 = new Student();
//        s1.sleep();


        //实例化一个Student类的数组
        Student[] students = new Student[3];
        //实例化数组中的对象
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        
        //for循环实现实例化
//        for (int i = 0; i <3 ; i++) {
//            students[i] = new Student();
//        }

        System.out.println(students[0].name = "张三");


    }
}
