package 实验1;

public class Test10 {
    public static void main(String[] arg) {

        int k = 0;
        loop:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            k++;
            if (k / 5 == k / 5.0) {
                System.out.println(" " + i);
            } else {
                System.out.print(" " + i);
            }
        }
    }
}