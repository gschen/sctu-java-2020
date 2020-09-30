package 实验1;
import java.util.Random;
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        int rightNum = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("请猜1-100的数字");
            input = scanner.nextInt();
            if (input > rightNum) {
                System.out.println("猜大了!");
            } else if (input < rightNum) {
                System.out.println("猜小了!");
            }else {
                System.out.println("恭喜猜对!");
            }
        } while (input != rightNum);
    }
}
