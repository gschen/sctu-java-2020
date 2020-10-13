package 课堂练习01.Java;

public class Client2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        a = new Bird();
        a.eat();

        a = new Cat();
        a.eat();
    }
}
