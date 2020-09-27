package edu.sctu.java.Day0922;

public class Client1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        a = new Bird();//向上转型
        a.eat();

        a = new Cat();//向上转型
        a.eat();

        Bird aa = (Bird) a;//向下转型
        Cat bb = (Cat) a;//向下转型
    }
}
