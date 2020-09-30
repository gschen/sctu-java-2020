package java0923;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.leg();

        a = new Fish();
        a.leg();

        a = new Cat();
        a.leg();

        a = new Bird();
        a.leg();
    }
}
