package experiment01;
import java.util.Scanner;

public class Text11 {
    int num;
    public void method(int num){
        if(num < 10){
            System.out.println("个位数");
        }else if (num < 100){
            System.out.println("十位数");
        }else if (num < 1000){
            System.out.println("百位数");
        }else if (num < 10000){
            System.out.println("千位数");
        }else{
            System.out.println("万位数");
        }
    }

    public void method1(int num){
        String sh = String.valueOf(num);
        StringBuilder s = new StringBuilder(sh).reverse();
        String p = s.toString();
        int k = Integer.parseInt(p);
        if(k == num){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }

    public static void main(String[] args) {
        Text11 t = new Text11();
        Scanner nums = new Scanner(System.in);
        int n = nums.nextInt();
        t.num = n;
        t.method(t.num);
        t.method1(t.num);
    }
}
