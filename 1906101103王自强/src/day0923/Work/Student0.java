package day0923.Work;

public class Student0 {
    String stuId;
    String claId;
    String name;
    String sex;
    int age;

    void getStuId(){
        System.out.println(stuId);
    }
    void getClaId(){
        System.out.println(claId);
    }
    void getName(){
        System.out.println(name);
    }
    void getSex(){
        System.out.println(sex);
    }
    void getAge(){
        System.out.println(age);
    }
    public String toString(){
        return name+"，性别："+sex+"，年龄："+age+"，学号："+stuId+"，班号"+claId;
    }

    public static void main(String[] args) {
        Student0 student0=new Student0();

        student0.name="张三";
        student0.sex="男";
        student0.age=18;
        student0.stuId="1906101";
        student0.claId="103";

        student0.getName();
        student0.getSex();
        student0.getAge();
        student0.getStuId();
        student0.getClaId();

        System.out.println(student0.toString());
    }
}
