package 实验二.Test07;

public class Student extends Person{
    // 属性
    int studentNumber;
    String school;

    // 构造方法
    public Student(String name, int age, String IDNumber, int studentNumber, String school) {
        super(name, age, IDNumber);
        this.studentNumber = studentNumber;
        this.school = school;
    }

    @Override
    public String returnMassage() {
        return String.format("姓名：%s\n年龄：%s\n身份证号：%s\n学号：%s\n学校：%s",
                name,age, IDNumber,studentNumber,school);
    }
}
