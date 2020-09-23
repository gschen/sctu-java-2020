package Test01;

public class Test3 {
    void f(){
        for(int i=1;i<=100;i++){
            System.out.println(i);
            if(i == 78)
                break;
        }
    }

    public static void main(String[] args) {
        Test3 T = new Test3();
        T.f();
    }
}
