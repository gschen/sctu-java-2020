package lesson.day0922;

public class ClientAnimal {

    public static void main(String[] args) {

        //多态
        Animal a = new Animal();
        a.eat();

        a = new Panda();  // a是引用，它可以通过指向父类的指针来调用在不同子类中实现的方法
        a.eat();          // 一个引用在不同情况下的多种状态

        a = new Cat();
        a.eat();



        Panda b = new Panda();
        Animal c = b;
        c.eat();

        //向下转型
        Cat cat = (Cat) new Animal(); // alt + enter 进行强制转换
        cat.eat();

    }
}
