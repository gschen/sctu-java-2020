package experiment01;

public class Text02 {
    public void method(){
        for (int i = 100; i <= 300 ; i++) {
            if (i % 3 != 0){
                System.out.println(i);
                continue;
            }
        }
    }
    public static void main(String[] args) {
        Text02 s = new Text02();
        s.method();
    }
}
