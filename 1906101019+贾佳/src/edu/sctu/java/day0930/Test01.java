package edu.sctu.java.day0930;

public class Test01 {
    void a(){
        try {
            b();
        }catch (Exception e){
            System.out.println("a处理错误!");
        }
    }

    void b(){
        try {
            System.out.println(10/0);
        }catch (Exception e){
            throw new ArithmeticException();//将错误抛给上一层方法
        }
    }
    void aa() throws ArithmeticException{
        bb();
    }
    void bb(){
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        Test01 t = new Test01();
        t.a();
        t.aa();;
    }
}
