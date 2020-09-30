package edu.sctu.java.day0930;

public class ExceptionText01 {


    void a(){
        try {
            b();
        }catch (Exception e){

            System.out.println("在a中处理错误");
        }

    }

    void b(){

        try {
            System.out.println(10/0);
        }catch (Exception e ){
//            System.out.println("在b中处理错误");
            throw  new ArithmeticException();
        }

    }


    public static void main(String[] args) {
        ExceptionText01 exceptionText01 = new ExceptionText01();
        exceptionText01.a();
    }


}
