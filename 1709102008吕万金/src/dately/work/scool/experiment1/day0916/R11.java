package dately.work.scool.experiment1.day0916;

import java.util.Scanner;
public class R11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入1-9999之间的数字:");

        String number = scanner.next();
        System.out.println("您输入的是"+number.length()+"位数");
        boolean flag = true;
        for(int i=0;i<number.length()/2;i++){
     //把索引为i位置的字符和它对称索引位置的字符相比，看是否一样
            if(!String.valueOf(number.charAt(i)).equals(String.valueOf(number.charAt(number.length()-i-1)))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("它是回文数");
        }else{
            System.out.println("它不是回文数");
        }}}
//        String num = scanner.nextLine();
//
//        int i=num.length()-1;
//        int j=0;
//        while (i>j){
//            if(num.charAt(i)!=num.charAt(j)){
//                j++;
//                i--;
//            }
//        }
//
//    }
//}