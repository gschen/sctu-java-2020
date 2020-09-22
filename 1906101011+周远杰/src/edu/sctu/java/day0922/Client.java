package edu.sctu.java.day0922;

public class Client {

    public static void main(String[] args) {


        //类的继承 非常重要的一种实例化方法
        Person zhou = new Person();

        Person zz = new Doctor();
        zz.rest();
        zz.work();
    }
}
