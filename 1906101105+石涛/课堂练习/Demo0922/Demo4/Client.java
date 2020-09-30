package Demo0922.Demo4;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        animal = new Bird();
        animal.eat();

        animal = new Cat();
        animal.eat();
    }
}
