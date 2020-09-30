package edu.sctu.java.Day0930;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        int i =0;
        while (true){
            System.out.println(i++);
            Thread.sleep(500);

            try {
                if (i == 5) {
                    System.out.println(10 / 0);
                }
            }catch (NullPointerException e){
                System.out.println("除零错误");
            }catch (Exception e){
                    System.out.println("出错啦!!!");
            }
        }

    }
}
