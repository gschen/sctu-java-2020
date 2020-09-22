package day0916.work;

public class W5 {
    void gradeIf(int n){
        if(n==1){
            System.out.println("不及格");
        }
        else if(n==2){
            System.out.println("及格");
        }
        else if(n==3){
            System.out.println("中等");
        }
        else if(n==4){
            System.out.println("良好");
        }
        else{
            System.out.println("优秀");
        }
    }
    void gradeSwitch(int n){
        String str;
        switch (n){
            case 1:
                str="不及格";
                break;
            case 2:
                str="及格";
                break;
            case 3:
                str="中等";
                break;
            case 4:
                str="良好";
                break;
            default:
                str="优秀";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        W5 w5=new W5();
        for (int i=1;i<=5;i++){
            System.out.println("if"+i);
            w5.gradeIf(i);
            System.out.println("switch"+i);
            w5.gradeSwitch(i);
        }
    }
}
