package Test01;
import java.util.Scanner;

public class Test5 {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    void f(){
        if(n == 1){
            System.out.println("不及格");
        }
        else if(n == 2){
            System.out.println("及格");
        }
        else if(n == 3){
            System.out.println("中等");
        }
        else if(n == 4){
            System.out.println("良好");
        }
        else{
            System.out.println("优秀");
        }
    }

    void f1(){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch (i){
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 5:
                System.out.println("优秀");
                break;
        }
    }

    public static void main(String[] args) {
        Test5 T = new Test5();
        T.f();
        T.f1();
    }

}
