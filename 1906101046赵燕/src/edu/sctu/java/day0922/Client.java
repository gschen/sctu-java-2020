package edu.sctu.java.day0922;

public class Client extends Father{
    public static void main(String[] args) {

        //类的继承 非常重要的一种实例化方法
        Father chen = new Father();

        Father cc = new Son();
        cc.eat();
        cc.study();

        Son chencc = new Son();
        chencc.eat();
        chencc.study();
    }
}
