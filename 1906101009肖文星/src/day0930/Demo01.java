package day0930;

public class Demo01 {
    public static void main(String[] args) {

//        System.out.println(10/0);

        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("出错了"+" "+e);
        }

        System.out.println("结束");
    }
}
