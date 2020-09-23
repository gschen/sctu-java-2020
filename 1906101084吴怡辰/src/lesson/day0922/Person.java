package lesson.day0922;


public class Person {

    String name;
    int age;

    void study() {
        System.out.println("父亲在学习");
    }



    // 方法重载
    void study(String who) {
        System.out.println(who + "学习");
    }

    void study(String name,int age) {
        System.out.println(name+age);
    }

    public static void main(String[] args) {

        Person wu = new Person();
        wu.name = "wu";
        wu.age = 18;

        wu.study();

        wu.study("wu");
        wu.study("wu",18);

    }
}
