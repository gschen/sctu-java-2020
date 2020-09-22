package experiment01;

public class Text05 {
    int grade;
    public void method1(int grade){
        if(grade == 1){
            System.out.println("不及格");
        }else if(grade == 2){
            System.out.println("及格");
        }else if(grade == 3){
            System.out.println("中等");
        }else if(grade == 4){
            System.out.println("良好");
        }else {
            System.out.println("优秀");
        }
    }
    public void method2(int grade){
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
        Text05 s = new Text05();
        s.grade = 3;
        s.method2(s.grade);
        s.method1(s.grade);
    }
}
