package Test01;
import java.util.Scanner;

public class Test4 {

    Scanner input = new Scanner(System.in);
    int contents=input.nextInt();

    void SumFor(){
        int sums = 0;
        for(int i=1;i<=contents;i++){
            sums += i;
        }
        System.out.println(sums);
    }

    void SumWhile(){
        int sums = 0;
        int i = 1;
        while(i<=contents){
            sums += i;
            i++;
        }
        System.out.println(sums);
    }

    void SumDoWhile(){
        int sums = 0;
        int i = 1;
        do{
            sums += i;
            i++;
        }
        while(i<=contents);
        System.out.println(sums);
    }

    public static void main(String[] args) {
        Test4 T = new Test4();
        T.SumFor();
        T.SumWhile();
        T.SumDoWhile();
    }
}
