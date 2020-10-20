package edu.sctu.java.day0915;

public class Je020301 {
    public static void main(String args[]){
        int x=5,y,z;   //赋值 x为整数5，定义一个y,z;
        z=x;  //将x赋值给z;
        y=++x; //在运算之前将x赋值为一
        System.out.println("y="+y+"x="+x);
        x=z;
        y=x++;//在运算之后将x得赋值为一
        System.out.println("y="+y+"x="+x);
    }
}
