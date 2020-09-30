package demo0922;

public class Client {
    public static void main(String[] args) {
        Animal a=new Animal();

        a.sleep();

        a=new Dog();
        a.name="可乐";
        a.sleep();

//        Dog dog=(Dog) new Animal();  //alt+enter
//        dog.sleep();

    }
}


