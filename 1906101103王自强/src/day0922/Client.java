package day0922;

import day0916.A;

public class Client {
    public static void main(String[] args) {
//
//
////        Animal animal=new Animal();
////
////
////        animal.age=5;
////        animal.name="小白";
////
////
////        animal.run();
////
////
////        animal =new Bird();
////        animal.run();
//
//        Hero yasuo=new Yasuo();
//
//
//        yasuo.q();
//        yasuo.w();
//        yasuo.e();
//        yasuo.r();
//
//
////        animal =new Cat();
////        animal.run();
        Animal animal=new Bird();
        animal.run();
        Bird bird=(Bird) animal;
        bird.run();
        Cat cat=(Cat) new Animal();
        cat.run();
     }
}