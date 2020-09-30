package day0922;

public class Dog extends Animal {
    @Override
    void sleep(){
        super.sleep();
        System.out.println(name+"正在睡");
    }
}
