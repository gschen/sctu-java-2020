package java0299;

public class Fish extends Animal{
    @Override
    public void leg(){
        System.out.println("Fish没有腿");
    }

    public void eat(){
        System.out.println("Fish正在吃");
    }
}
