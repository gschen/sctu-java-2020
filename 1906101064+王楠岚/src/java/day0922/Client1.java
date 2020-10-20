package java.day0922;

public class Client1 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        a = new Bird();
        a.eat();

        a = new Cat();
        a.eat();

        Cat b = (Cat) a;
        b.eat();

    }
}
