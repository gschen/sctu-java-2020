package java0929;

public class TryCatch {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(10 / i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
