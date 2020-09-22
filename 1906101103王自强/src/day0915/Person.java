package day0915;

public class Person {
    String name;
    int age;
    String sex;
  // Person(String name,int age,String sex){
//        this.name=name;
//        this.age=age;
//        this.sex=sex;
  //  }

    public void study(){
        System.out.println(name+"正在学习");
    }

    public void run() {
        System.out.println(name+"正在跑步");
    }

    public void movie() {
        System.out.println(name+"正在看电影");
    }
}