package edu.sctu.java.day1010;

public class People {

    String name;
    int age;

    void rest(){
        System.out.println(age+"岁"+name+"正在休息");
    }

    void eat(){
        System.out.println(age+"岁"+name+"正在吃饭");
    }
}
class ChinaPeople extends People{

    ChinaPeople(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void rest(){
        System.out.println(age+"岁"+name+"正在休息");
    }

    @Override
    void eat(){
        System.out.println(age+"岁"+name+"正在吃饭");
    }
}
class AmJericanPeople extends  People{

    AmJericanPeople(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void rest(){
        System.out.println(age+"岁"+name+"不想休息");
    }

    @Override
    void eat(){
        System.out.println(age+"岁"+name+"不想吃饭");
    }
}
class BeiJingPeople extends People{

    BeiJingPeople(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void rest(){
        System.out.println(age+"岁"+name+"可以休息");
    }

    @Override
    void eat(){
        System.out.println(age+"岁"+name+"不想吃饭");
    }
}
class Client {
    public static void main(String[] args){

        ChinaPeople chinaPeople = new ChinaPeople("小陆",18);
        chinaPeople.rest();
        chinaPeople.eat();

        BeiJingPeople beiJingPeople = new BeiJingPeople("小燃",18);
        beiJingPeople.rest();
        beiJingPeople.eat();

        AmJericanPeople amJericanPeople= new AmJericanPeople("小柯",18);
        amJericanPeople.rest();
        amJericanPeople.eat();
    }
}
