package 实验二.Test07;

public class Person {
    // 属性
    String name;
    int age;
    String IDNumber;

    // 构造方法
    public Person(String name, int age, String IDNumber) {
        this.name = name;
        this.age = age;
        this.IDNumber = IDNumber;
    }

    // 返回信息
    public String returnMassage(){
        return String.format("姓名：%s\n年龄：%s\n身份证号：%s",name,age, IDNumber);
    }
}
