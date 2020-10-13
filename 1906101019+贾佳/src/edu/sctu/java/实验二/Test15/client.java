package edu.sctu.java.实验二.Test15;

public class client {
    public static void main(String[] args) {
        Graduate gra = new Graduate();
        gra.name = "zhangsan";
        gra.sex = "male";
        gra.age = 18;
        gra.setFee(5000.0);
        gra.setPay(3000.0);
        double Fee = gra.getFee();
        double Pay = gra.getPay();
        if((Pay*12.0)-Fee>2000){
            System.out.println("You income is enough！");
        }else {
            System.out.println("You  need a loan!");
        }

    }
}
