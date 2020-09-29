package Test1;

public class Test09 {
    public static void main(String[] args) {
        int a = 65;
        int b = 3;
        int c = 1;
        int d = -1;

        while (a<85){
            for (int i=0;i<b;i++){
                System.out.print(" ");
            }
            for (int j=0;j<c;j++){
                System.out.print((char) a+" ");
                a+=1;
            }
            System.out.println("");
            b+=d;
            c-=d;
            if(b<0){
                d=1;
                b=0;
                c=4;
            }
        }
    }
}

