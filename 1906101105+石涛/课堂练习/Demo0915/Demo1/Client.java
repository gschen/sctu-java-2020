package Demo0915.Demo1;

// 客户端
public class Client {

    // main函数  psvm+tab(回车)-->生成代码
    public static void main(String[] args) {
        // sout+tab(回车)-->生成代码
        // ctrl+B 直接进入函数（等同于ctrl+鼠标左键）
        System.out.println("Hello World !");

        // 使用其它类
        Student Jack = new Student(123,"Jack","男","19信管03班");
        Jack.study();
        Jack.eat();
        Jack.sleep();
    }
}
