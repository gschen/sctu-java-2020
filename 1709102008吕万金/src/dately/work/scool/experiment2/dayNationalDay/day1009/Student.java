package dately.work.scool.experiment2.dayNationalDay.day1009;

public class Student extends Person {
    int schoolNo;
    String school;

    Student(String name, int age, String no,int schoolNo,String school) {
        super(name, age, no);
        this.schoolNo=schoolNo;
        this.school=school;
    }
    int getSchoolNo(){
        return schoolNo;
    }
    String getSchool(){
        return school;
    }

    void print(){
        System.out.println(
                "姓名："+this.name+"\n"
                +"年龄："+this.age+"\n"+
                "身份证号："+this.no+"\n"+
                "学号："+this.schoolNo+"\n"+
                "所在学校："+this.school+"\n"
        );
    }
}
