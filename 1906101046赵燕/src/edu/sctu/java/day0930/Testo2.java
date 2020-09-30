package edu.sctu.java.day0930;

public class Testo2 {
    public static void main(String[] args) throws InterruptedException{
        int i = 0;

        while (true){
            System.out.println(i++);

            Thread.sleep(100);//控制代码运行速度

            try{
                if(i == 5 ){
                    System.out.println(10/0);
                }

            }catch(ArithmeticException e){
                System.out.println("除零错误！！！");
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("错误");

            }
        }
    }
}

