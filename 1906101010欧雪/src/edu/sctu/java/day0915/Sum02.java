package edu.sctu.java.day0915;

public class Sum02 {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while(i<=100){
            sum=i+sum;
            i++;
        }
        System.out.println("sum:"+sum);
    }
}
