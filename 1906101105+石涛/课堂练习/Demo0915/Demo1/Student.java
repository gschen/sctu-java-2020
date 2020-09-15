package Demo0915.Demo1;

public class Student {

    // 成员变量
    private int id;
    private String name;
    private String sex;
    private String classes;

    // 构造方法
    public Student(int id, String name, String sex, String classes) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classes = classes;
    }

    // 方法
    void study(){
        System.out.println(name+"正在"+classes+"学习");
    }

    void eat(){
        System.out.println(name+"正在吃饭");
    }

    void sleep(){
        System.out.println(name+"正在睡觉");
    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }

    String getSex(){
        return sex;
    }

    String getClasses(){
        return classes;
    }

    // 程序入口
    public static void main(String[] args) {
        Student student = new Student(123456,"小明","男","19信管3班");
        System.out.println(student.getName()+"是一个"+student.getClasses()+"的"+student.getSex()+"同学");
        student.study();
        student.eat();
        student.sleep();
    }
}
