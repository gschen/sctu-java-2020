package Test1;

import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        System.out.println("输入n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        do{
            sum +=i;
            i++;
        }while (i<=n);
        System.out.println(sum);
    }
}

//while循环
// import java.util.Scanner;
//public class Test04 {
//    public static void main(String[] args) {
//        System.out.println("输入n:");
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int sum = 0;
//        int i = 1;
//        while(i<=n){
//            sum +=i;
//            i ++;
//        }
//        System.out.println(sum);
//    }
//}

//for循环
//import java.util.Scanner;
//public class Test04 {
//    public static void main(String[] args) {
//        System.out.println("输入n:");
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int sum = 0;
//        for (int i=1;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//}

