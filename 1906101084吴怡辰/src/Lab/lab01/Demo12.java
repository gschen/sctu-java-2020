package Lab.lab01;

public class Demo12 {

    public static void main(String[] args) {

        int ge, shi, bai;

        for (int i = 100; i < 1000; i++) {

            ge = i % 10;
            shi = (i / 10) % 10;
            bai = i / 100;

            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3) == i) {
                System.out.println(" "+i);
            }
        }

    }
}
