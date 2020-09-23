package lesson.day0922;

public class Panda extends Animal{

    @Override
    void eat() {
        super.eat();
        System.out.println("熊猫吃竹子");
    }


    public static void main(String[] args) {

        Panda p = new Panda();
        p.eat();

    }
}
