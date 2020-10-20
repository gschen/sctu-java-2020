package 实验二.School;

public class Client {
    public static void main(String[] args) {
        Graduate graduate=new Graduate();

        graduate.name="zhangsan";

        graduate.setPay(4000);
        graduate.setFee(2000);

        graduate.isEnough();
    }
}
