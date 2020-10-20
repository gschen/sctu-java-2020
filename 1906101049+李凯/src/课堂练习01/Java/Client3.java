package 课堂练习01.Java;

public class Client3 {
    public static void main(String[] args) {
        Firm A=new Firm();

        A = new Javaworker();
        A.work1();

        A=new Pythonworker();
        A.work2();
        //匿名对象
        Javaworker B = new Javaworker();
        Firm a=B;
        Firm aa = new Javaworker();  //向上转型             ALT +ENTER  错误转换
        Javaworker Javaworker = (Javaworker) new Firm();
        Pythonworker pythonworker = (Pythonworker) new Firm();


    }
}
