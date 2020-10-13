package edu.sctu.java.day0921;

public class test {
    public static void main(String[] args){
        char grade=' ';
        System.out.println("请输入等级：");
        try{
            grade=(char)System.in.read();
        }catch(Exception e){}
        switch(grade){
            case'A':
                System.out.println("范围在85~100");
                break;
            case'B':
                System.out.println("范围在70~85");
                break;
            case'C':
                System.out.println("范围在60~70分以下");
                break;
            case'D':
                System.out.println("范围在60分以下");
            default:
                System.out.println("输入有误!");
        }
    }
}
