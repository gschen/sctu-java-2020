package dately.work.scool.experiment1.day0916;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class R10 {
    int i,j;
    int k=0;

    void run(){
        for (i=2;i<100;i++){
            for (j=2;j<i;j++){
                if (i%j==0){
                    break;
                }

        }
            if(j==i){
                k++;
                System.out.print(i+" ");
                if (k%5==0){
                    System.out.println("\n");
                }}
        }
    }
    public static void main(String[] args) {
        R10 r10=new R10();
        r10.run();


    }


    }
//        int i,j;
//        int k=0;
//        for (i=2;i<=100;i++){
//            for (j=2;j<i;j++){
//                if (i%j==0){
//                    break;
//                }
//            }
//            if (j>=i){
//                k++;
//                System.out.print(i+" ");
//                if (k%5==0){
//                    System.out.println("\n");
//            } }
//        }
//    }
//}

