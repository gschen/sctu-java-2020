package Test01;
import java.util.Scanner;

public class Test7 {
    Scanner input = new Scanner(System.in);
    int number = (int)(Math.random()*100)+1;
    void f(){
        while (true) {
            int n = input.nextInt();
            if (n>number){
                System.out.println("猜大了");
            }
            else if (n<number){
                System.out.println("猜小了");
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Test7 T = new Test7();
        T.f();
    }
}
