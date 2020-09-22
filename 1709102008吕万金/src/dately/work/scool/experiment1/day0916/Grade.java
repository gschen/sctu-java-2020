package dately.work.scool.experiment1.day0916;
/*某同学某门课的成绩可能的结果为1，2，3，4，和5。
当成绩为1时请输出不及格；成绩为2时请输出及格；
成绩为3时请输出中等；成绩为4时请输出良好；
成绩为5时请输出优秀。*/
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner grade=new Scanner(System.in);
        int level=grade.nextInt();
        //IF-ELSE
        if (level==1){
            System.out.println("不及格");
        }else if (level==2){
            System.out.println("及格");
        }else if (level==3){
            System.out.println("中等");
        }else if(level==4){
            System.out.println("良好");
        }else if (level==5){
            System.out.println("优秀");
        }
        //Switch-case
        switch (level){
            case 1:
                System.out.println("不及格");
            case 2:
                System.out.println("及格");
            case 3:
                System.out.println("中等");
            case 4:
                System.out.println("良好");
            case 5:
                System.out.println("优秀");
        }

    }
}
