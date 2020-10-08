package 实验二.Test16;

public class Client {
    public static void main(String[] args) {
        // 实例化,上转型
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();

        // 调用方法
        System.out.println(addition.add(5,2));
        System.out.println(subtraction.subtract(5,2));
        System.out.println(multiplication.multiply(5,2));
        System.out.println(division.divide(5,2));
    }
}
