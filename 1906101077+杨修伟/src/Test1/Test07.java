package Test1;
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        System.out.println(number);
        while (true) {
            System.out.println("请输入你的猜测g:");
            Scanner s = new Scanner(System.in);
            int g = s.nextInt();

            if (g > number)
                System.out.println("猜大了");
            if (g < number)
                System.out.println("猜小了");
            if (g == number)
                System.out.println("猜对了");
        }
    }

}
