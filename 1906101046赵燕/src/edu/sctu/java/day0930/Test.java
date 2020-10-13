package edu.sctu.java.day0930;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        int i = 0;

        while (true){

            System.out.println(i++);

            Thread.sleep(100);//控制代码运行速度

            try{
                if(i == 5 ){
                    System.out.println(10/0);
                }

            }catch(Exception e){
                    System.out.println("出错啦！！！");
            }
        }
    }
}
