package experiment01;
import java.util.Scanner;

public class Text07 {

    public void randoms(){
        int max = 100; int min = 1;
        int p = (int) (min+Math.random()*(max-min+min));
        int conjecture;
        do{
            Scanner q = new Scanner(System.in);
            conjecture = q.nextInt();
            if (conjecture == p) {
                System.out.println("猜对了");
            } else if (conjecture > p) {
                System.out.println("猜大了");
            } else if (conjecture < p) {
                System.out.println("猜小了");
            }
        }while (conjecture != p);
    }

    public static void main(String[] args) {
        Text07 s = new Text07();
        s.randoms();
    }
}
