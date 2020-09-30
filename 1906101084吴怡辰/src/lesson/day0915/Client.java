package lesson.day0915;

public class Client {

    public static void main(String[] args) {

        Student lily = new Student();

        lily.name = "Lily";
        lily.age = 18;
        System.out.println(lily.name);
        System.out.println(lily.age);

        lily.study();

    }

}
