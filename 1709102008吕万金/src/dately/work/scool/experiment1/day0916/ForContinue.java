package dately.work.scool.experiment1.day0916;

public class ForContinue {
    public static void main(String[] args) {
        for(int n=100;n<=300;n++){
            if( n % 3 == 0){
                continue;
            }
            System.out.print(n +",");
        }
    }
}
