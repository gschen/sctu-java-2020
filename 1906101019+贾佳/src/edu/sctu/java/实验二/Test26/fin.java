package edu.sctu.java.实验二.Test26;



public class fin {
    public static void main(String[] args) {

        try {
            int answer = 10 / 0;
            System.out.println(answer);
        }catch(ArithmeticException e){
            System.out.println("被除数为0");
        }
        finally {
            System.out.println("错误捕获");
        }
    }
}
