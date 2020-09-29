package edu.sctu.java.day0915;

public class Food {
    String name;
    String Date;
    int LastTime;

    void address(){System.out.println("从深圳发出。");}
    void time(){System.out.println("到达时间三天。");}

    public static void main(String[] args) {
        Food tang=new Food();
        tang.name="汤圆";
        tang.Date="20200912";
        tang.LastTime=180;
        System.out.println("食品名："+tang.name);
        System.out.println("生产日期："+tang.Date);
        System.out.println("有效期:"+tang.LastTime+"天");
        tang.address();
        tang.time();
    }
    }