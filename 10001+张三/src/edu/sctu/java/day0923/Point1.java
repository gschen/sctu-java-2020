package edu.sctu.java.day0923;

public class Point1 {
    int x,y;
    Point1(int a,int b){x=a;x=b;}
    Point1(){x=-1;y=-1;}

    public static void main(String args[]){
        Point1 p1= new Point1();
        Point1 p2= new Point1(10,10);
        System.out.println("p1点=<"+p1.x+","+p1.y+"");
        System.out.println("p2点=<"+p2.x+","+p2.y+"");

    }

}
