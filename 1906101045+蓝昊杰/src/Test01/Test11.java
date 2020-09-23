package Test01;
import java.util.Scanner;

public class Test11 {
    Scanner input = new  Scanner(System.in);
    String n = input.next();
    int len = n.length();
    String reverse = new  StringBuffer(n).reverse().toString();
    void f(){
        if (n.equals(reverse)){
            System.out.println("长度为"+len+"是回文数");
        }
        else{
            System.out.println("长度为"+len+"不是回文数");
        }
    }

    public static void main(String[] args) {
        Test11 T = new Test11();
        T.f();
    }
}

