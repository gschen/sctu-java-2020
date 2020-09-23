package dately.work.scool.experiment1.day0916;

import java.util.Scanner;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        //for
        int s1=0;
        for (int i=1;i<=n;i++){
            s1=s1+i;
        }
        System.out.println(s1);
        //while
        int n2=1;
        int s2=0;
        while(n2<=n){
            s2+=n2;
            n2++;
        }
        System.out.println(s2);
        //do..while
        int n3=1;
        int s3=0;
        do {
            s3+=n3;
            n3++;
        }while(n3<=n);
        System.out.println(s3);




    }
}
