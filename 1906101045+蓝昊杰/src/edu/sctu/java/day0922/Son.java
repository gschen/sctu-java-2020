package edu.sctu.java.day0922;

public class Son extends Father{

    int ages = 18;
    String names = "nike";

    void study(){
        System.out.println("太难了");
    }

    void eat(){
        System.out.println("好次");
    }

    public static void main(String[] args) {
        Father fa = new Father();
        Son s = new Son();
        fa.age = 25;
        fa.name = "bb";
        fa.eat();
        s.ages = 18;
        s.names = "b";
        s.study();
        System.out.println(fa.name+":"+fa.age);
        System.out.println(s.names+":"+s.ages);

    }
}
