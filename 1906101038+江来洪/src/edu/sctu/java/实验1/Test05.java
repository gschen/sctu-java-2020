package edu.sctu.java.实验1;
import java.util.Random;
public class Test05 {
    String gradeIf(int grade) {
        if (grade == 1) {
            return "不及格";
        } else if (grade == 2) {
            return "及格";
        } else if (grade == 3) {
            return "中等";
        } else if (grade == 4) {
            return "良好";
        } else {
            return "优秀";
        }
    }
    void gradeSwitch(int grade){
        switch (grade){
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
    public static void main(String[] args) {
        Random rd = new Random();
        int grade = rd.nextInt(5)+1;
        Test05 test05 = new Test05();
        System.out.println(test05.gradeIf(grade));
        test05.gradeSwitch(grade);
    }
}
