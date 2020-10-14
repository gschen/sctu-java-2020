package edu.sctu.java.day1013;

public class Test03 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);

            Person chen;
//            chen.name = "chen";

        }catch (NullPointerException e){
            System.out.println("除零错误");
        }catch (ArithmeticException e){
            System.out.println("");
        }
    }
}
