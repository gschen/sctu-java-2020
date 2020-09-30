package edu.sctu.java.day0921;

public class D {
    public static void main(String[] args) {
        int a,b,d=0,count=0;
        for(a=1;a<=100;a++){
            for(b=2;b<a;b++){
                int c=a&b;
                if(c==0){
                    break;
                }
            }
            if(b==a){
                System.out.print(a+" ");
                count++;
                d++;
                if(count==5){
                    count=0;
                    System.out.println("");
                }
            }
        }
        System.out.println(d);
    }
}
