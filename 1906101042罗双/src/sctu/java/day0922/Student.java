package sctu.java.day0922;

public class Student extends Person{
    int grade;

    void study(){
        System.out.println("学习");
    }

    void eat(){
        System.out.println("eat");
    }
    public static void main(String[] args) {
        Student a = new Student();
        a.name="a";
        a.age=10;
        a.eat();
        a.study();
        System.out.println(a.age);
    }
}
