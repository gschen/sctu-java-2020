package edu.sctu.java.day1010;

public class Test01 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("除零错误");
        }
    }
}
