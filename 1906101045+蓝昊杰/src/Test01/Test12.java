package Test01;

public class Test12 {

    void f(){

        for(int i=100;i<=999;i++) {
            int a = i/100;
            int b = i%100/10;
            int c = i%100%10;
            if (i == a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Test12 T = new Test12();
        T.f();
    }
}
