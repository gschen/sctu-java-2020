package edu.sctu.java.day0930;

public class Test {

    void a(){
        try {
            b();
        }catch (Exception e){
            System.out.println("处理错误");
        }


    }

    void b(){


        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("上抛错误");
            throw new ArithmeticException();

        }


    }

}
