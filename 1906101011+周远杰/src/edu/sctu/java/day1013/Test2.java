package edu.sctu.java.day1013;

public class Test2 {
    void zhou(){
        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("错误！！！");
        }
    }

    public static void main(String[] args) {
        Test2 yuan = new Test2();
        yuan.zhou();
    }
}
