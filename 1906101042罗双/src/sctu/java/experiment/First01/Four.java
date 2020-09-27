package sctu.java.experiment.First01;
	//分别用 for 语句、while 语句以及 do while 语句编写一个求和程序（即 sum=1+2+3+...+n）。


//  for语句
//public class Four {
//    public static void main(String[] args) {
//        int i=1,sum=0,n=3;
//
//        for(i=1;i<=n;i++)
//            sum=sum+i;
//        System.out.println(sum);
//
//    }
//}
//
//
//while语句
//public class Four {
//    public static void main(String[] args) {
//        int i=1,sum=0,n=4;
//        while(i<=n){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}


//do while 语句
public class Four {
    public static void main(String[] args) {
        int i=1,sum=0,n=5;
        do {
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}
