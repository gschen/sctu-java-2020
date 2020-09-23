package lesson.day0916;

public class ClientPerson {
    public static void main(String[] args) {

        Person p = new Person();

        p.name = "lily";
//        p.age = 18;  //age变量被声明为private，不能被其他类访问
        p.height = 160;

    }
}
