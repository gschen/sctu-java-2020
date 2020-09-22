package Demo0922.Demo1;

public class Client {
    public static void main(String[] args) {
        // 类的继承，非常重要的一种实例化方法
        Child child = new Child();
        Parent parent = new Parent();
        Parent mix = new Child();

        child.name="小明";
        child.eat();
        child.study(); // child 的独特方法
        parent.name="小明爸爸";
        parent.eat();
        parent.teach(); // father 的方法

        System.out.println("-----------------------");

        mix.name="像小明的爸爸";
        mix.eat();
        mix.teach();
    }
}
