package java0299;

public class StudentB extends StudentA{
    String name = "张三";
    @Override
    public void method(){
//        super.method();

        System.out.println("我是B学生");
    }
    public void method(String name){
        System.out.println(name+"是学生");
    }
    public static void main(String[] args) {
        StudentA s = new StudentB();
        StudentB b = new StudentB();
        s.method();
        b.method();
        b.method(b.name);
    }
}
