package Demo0922.Demo6;

public class Client {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 向上转型
        dog.eat();

        Dog dog1 = (Dog) dog; // 向下转型
        dog1.eat();
        dog1.run();
    }
}
