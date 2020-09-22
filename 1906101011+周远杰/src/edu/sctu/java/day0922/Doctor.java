package edu.sctu.java.day0922;

public class Doctor extends Person {

    void eat(){
        System.out.println("正在吃午餐！");
    }

    @Override
    void work(){
        super.work();//访问并调用父类的该方法
        System.out.println("他没有在工作！！");
    }

}
