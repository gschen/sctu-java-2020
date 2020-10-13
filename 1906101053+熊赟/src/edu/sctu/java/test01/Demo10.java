package edu.sctu.java.test01;

public class Demo10 {
    public static void main(String[] args) {
        int n=1;
        for (int i=2;i<100;i++) {
            boolean flag=true;
            for (int j=2;j<i;j++){
                if (i%j==0)
                    flag = false;
            }
            if (flag)
                if (n%5!=0) {
                    System.out.print(i + ",");
                    n++;
                }else{

                    System.out.println(i);
                    n++;

                }
        }
    }
}

