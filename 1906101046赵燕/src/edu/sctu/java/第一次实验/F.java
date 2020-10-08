import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        if (grade.equals("A")){
            System.out.println("85分及以上");
        }
        else if (grade.equals("B")){
            System.out.println("[70,85)");
        }
        else if (grade.equals("C")){
            System.out.println("[60,70)");
        }
        else if (grade.equals("D")){
            System.out.println("60分及以下");
        }

    }
}

