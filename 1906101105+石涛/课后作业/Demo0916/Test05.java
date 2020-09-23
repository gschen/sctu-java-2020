package Demo0916;

import java.util.Scanner;

// 分别用 if-else 语句和 switch 语句编写能够实现以下功能的程序。
// 某同学某门课的成绩可能的结果为1，2，3，4，和5。
// 当成绩为1时请输出不及格；成绩为2时请输出及格；成绩为3时请输出中等；成绩为4时请输出良好；成绩为5时请输出优秀。
public class Test05 {
    // if-else 方法
    String ifElseJudge(int a){
        if(a==1){
            return "不及格";
        }
        else if(a==2){
            return "及格";
        }
        else if(a==3){
            return "中等";
        }
        else if(a==4){
            return "良好";
        }
        else if(a==5){
            return "优秀";
        }
        else{
            return "输入错误";
        }
    }

    // switch 方法
    String switchJudge(int a){
        switch (a){
            case 1 :
                return "不及格";
            case 2 :
                return "及格";
            case 3 :
                return "中等";
            case 4 :
                return "良好";
            case 5 :
                return "优秀";
            default:
                return "输入错误";
        }
    }

    public static void main(String[] args) {
        // 输入值
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();

        Test05 t = new Test05();
        System.out.println(t.ifElseJudge(a));
        System.out.println(t.switchJudge(a));
    }
}
