package edu.sctu.java.day0915;

import edu.sctu.java.day0916.TestOne;

public class TestThree extends TestOne {
    public static void main(String[] args) {
        TestThree chen = new TestThree();
        chen.name = "chen";
//        chen.sexy = "male";  //这里报错说明privat在子孙类中也不能使用
        chen.age = 16;
    }
}
