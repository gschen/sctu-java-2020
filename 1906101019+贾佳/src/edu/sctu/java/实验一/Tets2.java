package edu.sctu.java.实验一;
//2、	使用continue语句实现：将100-300之间的不能被3整除的数输出。
public class Tets2 {
    public static void main(String[] args) {

        int c =100;
        while (c<300){
           c++;
           if(c%3 ==0){
               continue;
           }
            System.out.println(c);
        }
    }
}
