package 实验二.Test15;

public class Client {
    public static void main(String[] args) {
        Graduate zhangSan = new Graduate();

        zhangSan.name = "张三";
        zhangSan.sex = "男";
        zhangSan.age = 20;

        zhangSan.fee = 5000;
        zhangSan.pay = 8000;

        if (zhangSan.getPay()-zhangSan.getFee()<2000){
            System.out.println("You  need a loan!");
        }else {
            System.out.println("You income is enough!");
        }
    }
}
