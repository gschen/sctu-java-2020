package day0916.work;

public class W10 {
    boolean isTure(int n) {
        boolean s = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s = false;
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        W10 w10 = new W10();
        int k = 0;
        for (int j = 1; j <= 100; j++) {
            if (w10.isTure(j)) {
                k++;
                System.out.print(j + " ");
            if (k % 5 == 0) {
                System.out.println();
                }
            }
        }
    }
}