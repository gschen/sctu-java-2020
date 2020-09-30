package edu.sctu.java.实验一;
//3、	使用break语句实现记数：从1-100，当数到78时程序终止。
public class test3 {
    public static void main(String[] args) {
        for(int i = 1;i<100;i++){
            System.out.println("当前程序运行位置"+i);
            if(i==78){

                break;
            }
        }
    }
}
