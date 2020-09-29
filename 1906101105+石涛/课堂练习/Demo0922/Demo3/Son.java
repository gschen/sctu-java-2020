package Demo0922.Demo3;

// ctrl + H 看到类的继承关系
public class Son extends Father{

    // 重写
    @Override
    void read() {
        super.read(); // 使用父类的方法

        System.out.println("son在读书"); // 子类的方法
    }
}
