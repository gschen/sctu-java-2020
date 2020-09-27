package Test01;

public class Test9 {

    void f(){

        int numbers = 65;
        int k = 1;
        int l = 4;

        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--) {
                System.out.print(" ");
            }
            for (int a=1;a<=k;a++){
                char n = (char) numbers;
                System.out.print(n+" ");
                numbers++;
            }
            System.out.println();
            k++;
        }

        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for (int a=1;a<=l;a++){
                char n = (char) numbers;
                System.out.print(n+" ");
                numbers++;
            }
            System.out.println();
            l--;
        }
    }

    public static void main(String[] args) {
        Test9 T = new Test9();
        T.f();
    }
}
