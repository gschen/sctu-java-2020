package edu.sctu.java.day0927;

public class SearchlastString {       //    定义一个SearchlastString的类
    public static void main(String[] args) {     //        java程序的入口地址
        String strOrig="Hello world,Hello Runoob";      //        字符串strOrig赋值"Hello world,Hello Runoob"
        int lastIndex=strOrig.lastIndexOf("Runoob");
        if(lastIndex==-1){
            System.out.println("没有找到字符串");
        }else{
            System.out.println("Runoob 字符串最后出现的位置："+lastIndex);
        }
    }
}
