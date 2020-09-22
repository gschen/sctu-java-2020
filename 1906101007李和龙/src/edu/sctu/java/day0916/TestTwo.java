package edu.sctu.java.day0916;

public class TestTwo {
    public static void main(String[] args) {
        TestOne li = new TestOne();
        li.age = 16;
        li.name = "li";
//        li.sexy = "male";  //这里报错说明在同一package中privat也不能使用
    }
}


/*
                 当前类        同一package           子孙类             其他package
 private           1               0                0                    0
 protected         1               1                1                    0
 public            1               1                1                    1

 */