package Demo0916;

// 显示1-100中的素数，每行显示5个数。（素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数。）
public class Test10 {
    public static void main(String[] args) {
        int a=1;
        int b=5;

        for (int i=1;i<101;i++){
            for (int j=2;j<i;j++){
                if(i%j==0){
                    a-=1;
                    break;
                }
            }
            if (a==1){
                b-=1;
                System.out.print(i+" ");
            }
            if (b<=0){
                b=5;
                System.out.println("");
            }
            a=1;
        }
    }
}
