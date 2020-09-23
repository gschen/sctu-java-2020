package lesson.day0922;

public class Student extends Person{

    @Override // 重写注解，表示子类方法重写了父类方法
    void study() {
        super.study();  // 当需要在子类中调用父类的被重写方法时，要使用super关键字

        System.out.println("儿子在学习");
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.study();

        Person wu = new Student();
        wu.study();

        Person p = new Person();
        p.study();
    }

}
