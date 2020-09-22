package edu.sctu.java;

public class StudentB extends StudentA {
    String name = "张三";
    @Override
    public void method(){
        super.method(); //先执行父类的方法
        System.out.println("我是子类");
    }

}
