package edu.sctu.java.day0921;

import java.lang.*;
import java.util.*;
public class FindHui {
    public static void main(String [] args){
        for(int i=1;i<100000;i++){
            int k=0;//存几位数
            int z=0;//存商
            int f=0;//存余数
            int num=i;//取i值
            String num2=""; //取之后余数的String

            String num1=""+i;//把int 变为String

//判断几位数

            do{

                k+=1;
                num=num/10;
            }while(num>0);
            num=i;//重新取i
            for(int j=0;j<k;j++){
                z=num/10;
                f=num%10;
                num=num/10;
                num2=num2+f;

            }
            if(num1.equals(num2)){
                System.out.print(i+"  ");
            }
        }
    }
}
