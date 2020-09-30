package edu.sctu.java.Day0930;

public class Test01 {

    void a(){
        try {
            b();
        }catch (Exception e){
            System.out.println("a在处理错误");
        }
    }

    void b(){

        try {
            System.out.println(10/0);
        }catch (Exception e){
            //System.out.println("b处理错误");
            throw new ArithmeticException();//将错误抛给上一级，b的上一级为a
        }

    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.a();

    }
}
