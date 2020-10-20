package dately.work.scool.experiment2.dayNationalDay.day1011;

public class T26 {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
            System.out.println("输入错误，除数不能为0");
        }finally {
            System.out.println("计算有误");
        }
    }
}

