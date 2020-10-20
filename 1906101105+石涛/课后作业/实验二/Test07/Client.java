package 实验二.Test07;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("Jack",20,"513921200005155918");
        Student student = new Student("Jack",20,"513921200005155918",12138,"SCTU");

        System.out.println(person.returnMassage());
        System.out.println(student.returnMassage());
    }
}
