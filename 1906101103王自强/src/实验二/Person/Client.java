package 实验二.Person;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "张三";
        person.age = 40;
        person.idNumber = "513822200010111111";

        person.getName();
        person.getAge();
        person.getIdNumber();


        Student student = new Student();

        student.name = "李四";
        student.age = 18;
        student.idNumber = "513822200010222222";
        student.stuId = "1906101100";
        student.school = "四川旅游学院";

        student.getName();
        student.getAge();
        student.getSchool();
        student.getStuId();
        student.getIdNumber();

    }
}