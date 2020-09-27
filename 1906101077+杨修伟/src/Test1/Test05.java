package Test1;
//import java.util.Scanner;
//public class Test05 {
//    public static void main(String[] args) {
//        System.out.println("输入i:");
//        Scanner s = new Scanner(System.in);
//        int i = s.nextInt();
//        if (i==1)
//            System.out.println("不及格");
//        if (i==2)
//            System.out.println("及格");
//        if (i==3)
//            System.out.println("中等");
//        if (i==4)
//            System.out.println("良好");
//        if (i==5)
//            System.out.println("优秀");
//
//        }
//    }

import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        System.out.println("输入i:");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch (i){
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 5:
                System.out.println("优秀");
                break;
        }
    }
}