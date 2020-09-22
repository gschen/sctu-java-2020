package experiment01;

public class Text03 {
    public void method(){
        for (int i = 1; i <= 100; i++ ){
            if(i == 78){
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Text03 s = new Text03();
        s.method();
    }
}
