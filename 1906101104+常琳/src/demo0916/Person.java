package demo0916;

//父类：
public class Person {
    public int age; //
    private String name;
    protected String eat;

    private void study(){
        System.out.println(name+"喜欢学习,"+"年龄："+age);
    }
    public void eat_fd(){
        System.out.println("我正在吃"+eat);
    }

    protected void protectedtest(){
        System.out.println("继承的类，可以访问我！");
    }

}
