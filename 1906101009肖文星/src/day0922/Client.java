package day0922;
//重载 overload : 方法名字一致，但是输入参数不同。
//重写 overwrite
public class Client {
    public static void main(String[] args) {
        Father x=new Father();
        x.age=50;
        x.name="x";
        x.eat();
        x.sleep();

        Father l=new Son();
        l.name="l";
        l.age=24;
        l.eat();
        l.sleep();

        Son cc=new Son();
        cc.age=19;
        cc.name="cc";
        cc.sleep();
        cc.eat();
    }
}
