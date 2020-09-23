package day0922;

public class Client {
    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.age=5;
        cat.name="小白";
        cat.run();
        cat.sleep();
    }
}
