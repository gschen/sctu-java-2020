package Lab.lab01;

public class Demo10 {
    public static void main(String[] args) {

        int n = 0;

        loop:
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }

            n++;

            if(n/5 == n/5.0) {
                System.out.println(" "+i);
            }else {
                System.out.print(" "+i);
            }
        }
    }
}
