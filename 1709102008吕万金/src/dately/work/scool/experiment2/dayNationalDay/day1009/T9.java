package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T9 {
    int no;
    String classNo;
    String name;
    String sex;
    int age;

    T9(int no,String classNo,String name,String sex,int age ){
        this.no=no;
        this.classNo=classNo;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    void setNo(int no){
        this.no=no;
    }
    void setClassNo(String classNo){
        this.classNo=classNo;
    }
    void setName(String name){
        this.name=name;
    }
    void setSex(String sex){
        this.sex=sex;
    }
    void setAge(int age){
        this.age=age;
    }
    public String toString( ){
        return "学号："+ this.no+"\n"+
        "班号："+ this.classNo+"\n"+
        "姓名："+ this.name+"\n"+
        "性别："+ this.sex+"\n"+
        "年龄："+ this.age+"\n";
    }

    public static void main(String[] args) {
        T9 test=new T9(1,"19信管03","xigua","girl",19);
        System.out.println(test.toString());

    }
}
