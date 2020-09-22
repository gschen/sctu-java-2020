package demo0922;

public class Son extends Father {
    public static void main(String[] args) {
        Father chen = new Father();

        chen.age = 20;
        chen.name = "chen";
    }
    void run(){
        System.out.println("我会跑！");
    }
    void study(){
        System.out.println("正是学习的年龄");
    }
    @Override   //注解，表示重写了父类的方法
    //overwrite 和 override
    void study(String who) {
        super.study(who);
    }

    @Override
    void study(int age) {
        super.study(age);
    }
}
