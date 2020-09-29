package lesson.day0916;

public class Person {

    public String name;  //public 对所有类可见。使用对象：类、接口、变量、方法
    private int age;    //private 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
    protected int height;   //protected 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）


    public static void main(String[] args) {

        Person p = new Person();

        p.name = "lily";
        p.age = 18;

    }

}
