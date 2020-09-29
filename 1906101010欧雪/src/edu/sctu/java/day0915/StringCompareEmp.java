package edu.sctu.java.day0915;

import sun.awt.geom.AreaOp;

public class StringCompareEmp {//定义一个类
    public static void main(String[] args) {//main函数，快捷键：psvm;不需要调用，可直接运行
        String str = "Hello World";//定义一个字符串str为 "Hello World"
        String anotherString = "hello world";//定义一个字符串anotherString为"Hello World"
        Object objStr = str;//String转化为Object

        System.out.println(str.compareTo(anotherString));//"Hello World" 和"hello world"之间比较，不同则返回一个小于0的值
        System.out.println(str.compareToIgnoreCase(anotherString));//compareToIgnoreCase比较时不区分大小写，比较方式一样
        System.out.println(str.compareTo(objStr.toString()));
    }
}
/*问题：Object objStr=str
        objStr.toString()*/
