package dately.work.scool.experiment1.day0916;

import java.util.Scanner;
public class R6 {
    public static void main(String[] args) {
        Scanner grade=new Scanner(System.in);
        String a=grade.nextLine();

        if (a.equals("A")){
            System.out.println("85分以上（包括85）");
        }else if (a.equals("B")){
            System.out.println("70分以上（包括70分）");
        }else if (a.equals("C")){
            System.out.println("60分以上（包括60分）");
        }else if (a.equals("D")){
            System.out.println("60分以下");
        }
    }
}
