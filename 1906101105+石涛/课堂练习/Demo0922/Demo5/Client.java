package Demo0922.Demo5;

public class Client {
    public static void main(String[] args) {
        // 实例化
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        Animal animal = new Animal();

        // 调用方法
        cat.run();
        mouse.run();

        animal.name="Animal";
        animal.run();
    }
}
