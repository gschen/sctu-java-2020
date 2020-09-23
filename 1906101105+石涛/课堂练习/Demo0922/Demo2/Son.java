package Demo0922.Demo2;

// ctrl + H 看到类的继承关系
public class Son extends Parent{

    // 重写
    @Override // 注解 annotation：表示子类重写了父类的方法
    void study() {
        super.study();
        super.study("father");

        System.out.println("son正在学习");
    }
}
