package edu.sctu.java.day0930;

public class Text03 {

    void a() {
        try {
            bb();
        }catch (Exception e){
            System.out.println("a处理错误");
        }
    }
    void b(){
        try{
            System.out.println(10/0);
        }catch (Exception e){
    //        System.out.println("b处理错误");

            throw new ArithmeticException();
            //向上抛出，上一级处理
        }

    }

    void aa() throws ArithmeticException{
        bb();
    }

    void bb(){
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        Text03 text03= new Text03();
        text03.aa();
    }
}
