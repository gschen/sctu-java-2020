package demo0916;

import demo0915.Inherit;

//实例化继承的类：
//对public、private、protected的理解

public class Student {
    public static void main(String[] args) {
        Inherit01 a = new Inherit01();
        //a.name = "飞飞"; 不能被访问
        a.age = 18;
        a.eat = "水果";

        a.eat_fd();

        a.protectedtest();  //可以被访问

     //   System.out.println(a.name+",这是一个继承的实例化！");
        System.out.println("飞飞今年"+a.age+"岁！");
    }
}

//标识符：关键词、用户自定义标识符
//修饰符 eg:public static final