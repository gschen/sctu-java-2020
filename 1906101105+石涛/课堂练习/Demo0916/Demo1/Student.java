package Demo0916.Demo1;

public class Student extends Person{

    // 属性
    int id;
    String classes;

    // 构造方法
    public Student(String name, String sex, int age, int id, String classes) {
        super(name, sex, age);
        this.id = id;
        this.classes = classes;
    }

    // 方法
    void study(){
        System.out.println("学习");
    }

    void goToClass(){
        System.out.println("去上学");
    }
}
