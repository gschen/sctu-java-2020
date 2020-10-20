package java.实验1;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int l = input.length();
        int count = 0;
        System.out.println("这是一个"+l+"位数");
        for (int i=0;i<l/2;i++){
            if (input.charAt(i)==input.charAt(l-1-i)){
                count += 1;
            }else{
                System.out.println("不是回文数");
                break;
            }
        }
        if (count == l/2){
            System.out.println("是回文数");
        }
    }
}
