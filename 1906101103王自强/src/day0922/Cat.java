package day0922;

import java.sql.SQLOutput;

public class Cat extends Animal{

    @Override
    void run() {
        System.out.println("猫正在跑");
    }

    void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
