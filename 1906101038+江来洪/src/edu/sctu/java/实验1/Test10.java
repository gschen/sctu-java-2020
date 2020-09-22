package edu.sctu.java.实验1;
public class Test10 {
    public static void main(String[] args) {
        int cols = 5;
        for (int i=2;i<=100;i++){
            int count = 0;
            for (int o=2;o<i;o++){
                if (i%o==0){
                    count += 1;
                }
            }
            if (count==0){
                cols -= 1;
                System.out.print(i+" ");
            }
            if (cols == 0){
                System.out.println();
                cols = 5;
            }
        }
    }
}
