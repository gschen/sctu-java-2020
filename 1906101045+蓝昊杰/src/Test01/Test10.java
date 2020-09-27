package Test01;

public class Test10 {
    void f() {
        int i, j, k = 0;
        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                k++;
                System.out.print(" " + i);
                if (k % 5 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }

        public static void main (String[]args){
            Test10 T = new Test10();
            T.f();
        }
}
