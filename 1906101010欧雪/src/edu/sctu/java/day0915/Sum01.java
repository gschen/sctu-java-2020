package edu.sctu.java.day0915;

public class Sum01 {
    public static void main(String[] args) {
        int sum=0;
        int n=100;
        for(int i=1;i<=n;++i){
            sum+=i;
        }
        System.out.println("1到100的和为："+sum);
    }
}
