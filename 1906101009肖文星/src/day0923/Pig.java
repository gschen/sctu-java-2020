package day0923;

public class Pig implements AnimalAction {
//    String name="墩墩";
    String name;

    @Override
    public void study() {
        System.out.println(name+"正在学");
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃");
    }

    @Override
    public void run() {
        System.out.println(name+"正在跑");
    }

    public static void main(String[] args) {
        AnimalAction pig=new Pig();
//        pig.name="墩墩";
        pig.eat();
        pig.run();
        pig.study();
    }
}
