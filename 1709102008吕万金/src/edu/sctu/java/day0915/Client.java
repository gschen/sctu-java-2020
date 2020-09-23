package edu.sctu.java.day0915;

public class Client extends D{
    // main函数 psvm+tab
    public static void main(String[] args) {
        //sout+ tab
        //光标放置在需要查询的代码上查询它的意思 ctrl+ B
//        Person chen=new Person();//new一个person就执行一次构造函数
//        chen.name="chen";
//        chen.age=18;
        Person chen=new Person("chen",18);

        chen.study();
        System.out.println(chen.name);
        D d=new D();
    }
}
