package 实验1;

public class Test04 {
    public static void main(String[] args) {
        int sum1=0;

        for(int i=1;i<=100;i++){
            sum1+=i;
        }
        System.out.println(sum1);
        int sum2=0;
        int j=1;
        while (j<=100){
            sum2+=j;
            j++;
        }
        System.out.println(sum2);
        int sum3=0;
        int k=1;
        do {
            sum3+=k;
            k++;
        }while (k<=100);
        System.out.println(sum3);
    }
}
