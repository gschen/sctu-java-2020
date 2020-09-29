package dately.work.scool.experiment1.day0916;

public class R12 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++) {
            int hundred=i/100;      //取百位
            int decede=i/10%10;    //取十位
            int one=i%10;       //取个位
            if(i==hundred*hundred*hundred+decede*decede*decede+one*one*one) {
                System.out.print(i+" ");
            }
        }
    }
}
