package Test01;
import java.util.Scanner;
public class Test6 {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    void f(){
        if(n>=85){
            System.out.println("A");
        }
        else if(n>=70){
            System.out.println("B");
        }
        else if(n>=60){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Test6 T = new Test6();
        T.f();
    }
}
