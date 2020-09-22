package experiment01;

public class Text08 {
    public void multiplication(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++){
                if (j<=i) {
                    System.out.print(j + "*" + i + "=" + i*j +"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Text08 s = new Text08();
        s.multiplication();
    }
}
