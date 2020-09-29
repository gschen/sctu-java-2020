package day0916.work;

public class W4 {
    void sumWhile(int n){
        int i=0;
        long sum=0;
        while (i<n){
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
    }
    void sumFor(int n){
        int i;
        long sum=0;
        for (i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    void sumDowhile(int n){
        int i=0;
        long sum=0;
        do{
            i++;
            sum=sum+i;
        }while (i<n);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        W4 b=new W4();
        b.sumDowhile(100);
        b.sumFor(100);
        b.sumWhile(100);
    }
}
