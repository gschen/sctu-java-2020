package Test01;

public class Test2 {
    void f() {
        for (int i = 100; i <= 300; i++) {
            if(i%3 == 0)
                continue;
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        Test2 T = new Test2();
        T.f();
    }
}
