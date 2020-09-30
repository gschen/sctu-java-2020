package Test1;

public class Test08 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"X"+i+"="+(i*j)+"\t");
            }
            System.out.println();

        }
    }

}
