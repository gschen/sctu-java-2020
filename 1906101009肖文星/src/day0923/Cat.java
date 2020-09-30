package day0923;

public class Cat implements AnimalAction {
    String name="球球";
    @Override
    public void study(){
        System.out.println(name+"正在学");
    }

    @Override
    public void eat() {

    }


    @Override
    public void run() {

    }

    public static void main(String[] args) {
        AnimalAction xx=new Cat();
//        xx.name="球球";
        xx.study();
    }
}
