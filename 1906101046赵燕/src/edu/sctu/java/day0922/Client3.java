package edu.sctu.java.day0922;

public class Client3 {
    public static void main(String[] args) {


//        Animal a = new Bird();
//
//        Bird b = new Bird();
//        b.eat();b

        Bird c = new Bird();
        Animal a = c;

        //匿名对象
        Animal aa = new Bird(); //向上转型
        
        //向下转型
        Cat cat = (Cat) new Animal();
        Bird bird = (Bird) new Animal();

//        Bird a1 = (Bird)a;
//        a1.eat();  //向下转型

    }
}
