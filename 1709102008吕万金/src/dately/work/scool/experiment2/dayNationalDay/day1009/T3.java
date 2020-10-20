package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T3 {
    String name;
    int age;
    int no;
    double pcGrade;
    double mathGrade;
    double englishGrade;
    double sum(){
        return pcGrade+mathGrade+englishGrade;
    }
    double average(){
        return this.sum()/3;
    }
    double max(){
        double s3;
        if (mathGrade>englishGrade){
            s3=mathGrade;
        }else s3 = Math.max(pcGrade, englishGrade);
        return s3;
    }
    double min(){
        double s4;
        if (mathGrade<englishGrade){
            s4=mathGrade;
        }else s4=Math.max(pcGrade,englishGrade);
        return s4;
    }
    public static void main(String[] args) {
        T3 student1=new T3();
        student1.name="xigua";
        student1.age=19;
        student1.no=1101101010;
        student1.pcGrade=97.1;
        student1.mathGrade=95.1;
        student1.englishGrade=98.0;
        System.out.println("学生姓名:"+student1.name);
        System.out.println("学生年龄:"+student1.age);
        System.out.println("学生学号:"+student1.no);
        System.out.println("计算机成绩:"+student1.pcGrade);
        System.out.println("数学成绩:"+student1.mathGrade);
        System.out.println("英语成绩:"+student1.englishGrade);
        System.out.println("总分："+student1.sum());
        System.out.println("平均分："+student1.average());
        System.out.println("最高分："+student1.max());
        System.out.println("最低分："+student1.min());
    }
}
