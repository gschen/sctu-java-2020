package experiment01;

public class Text10 {
    public void method(){
        int s = 0;
        for (int i = 2; i <= 100 ; i++) {
            String p = "True";
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    p = "False";
                    break;
                }
            }
            if (p == "True"){
                s += 1;
                if(s%5 == 0){
                    System.out.println(i+ " ");
                }else{
                    System.out.print(i+ " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Text10 t = new Text10();
        t.method();
    }
}
