package edu.sctu.java.day0930;

public class Test03 {

    void a() {
        try {
            bb();
        }catch (Exception e){
            System.out.println("a处理错误！");
        }
    }


    void aa() throws ArithmeticException{
        bb();
    }



    void b() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
//            System.out.println("b处理错误。");
            throw new ArithmeticException();
        }
    }

    void bb(){
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        test03.aa();
    }

}
