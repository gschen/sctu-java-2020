package java0299;

public class Clienta {
    public static void main(String[] args) {
        Animal a = new Fish();
        a.leg();
        Fish f = (Fish)a;
        f.eat();
        f.leg();
//        a.leg();
//        a = new Fish();
//        a.leg();
//        a = new Bird();
//        a.leg();
//        a = new Cat();
//        a.leg();
    }
}
