package edu.sctu.java.实验二.Test29;

public class outofbounds {
    public static void main(String[] args) {
        int [] lis = {1,2,3};
        try{
            System.out.println(lis[4]);
        }catch (ArrayIndexOutOfBoundsException A){
            System.out.println("数组越界");
        }finally {
            System.out.println("finally执行");
        }
    }
}
