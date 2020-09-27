package edu.sctu.java.day0922;

public class Client2 {

    public static void main(String[] args) {
//        Food a1=new Food();
//        a1.kind();
//        a1.kind("tangyuan");
//
//        a1 = new Sweet();
//        a1.kind();
//
//        a1=new Vegetable();
//        a1.kind();


        //向上转型
        Food a=new Sweet();

        Sweet b=new Sweet();
        Food c=b;

        a.kind();

        //向下转型
        Sweet e =(Sweet) c;
        e.kind();
    }
}
