package sctu.java.day0922;


//ctrl+h 看继承结构
public class Animal {
    String name;
    int age;

    void play(){
        System.out.println("animal正在玩！");
    }

    //重载overload    方法的名字一致，但是输入参数不同
    void play(String who){
        System.out.println(who+"正在玩！");
    }





    public static void main(String[] args) {
        Animal yuan = new Animal();
        yuan.name="yuan";
        yuan.age=10;

        yuan.play();
        yuan.play("ni");

    }
}
