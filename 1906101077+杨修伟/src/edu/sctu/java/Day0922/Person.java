package edu.sctu.java.Day0922;

public class Person {
    int age;
    String name;

    void say(){
        System.out.println("父亲杨说hhahhahahaah");
    }
    //重载 overload   方法的名字一致但是输入参数不同。
    void say(String who){
        System.out.println(who+"说hahahhahhhaha");
    }



    public static void main(String[] args) {
        Person yang = new Person();
        yang.name = "yang";
        yang.age = 19;

        yang.say();
        yang.say("张三");
    }
}
