package edu.sctu.java.day0916;

public class PersonD {
    private void method1(){
        System.out.println("我是private");
    }
    protected  void method3(){
        System.out.println("我是protected");
    }
    public void method2(){
        System.out.println("我是public");
    }
    public static void main(String[] args) {
        PersonD s = new  PersonD();
        s.method1();
    }
}
