package edu.sctu.java.day0915;

public class Demo01 {
    String a = "张三";
    String b = "语文";
    String c = "数学";
    String d = "英语";
    int e = 95;
    int f = 90;
    int g = 80;
    void grade(String a,String b,int e){
        System.out.println(a+b+':'+e);
    }
    //这是一个构造函数
    Demo01(){
        System.out.println("这是一个构造函数");
    }

    //d 变量 对象
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.grade(d.a,d.b,d.e);
    }


}
