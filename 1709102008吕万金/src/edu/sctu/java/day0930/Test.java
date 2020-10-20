package edu.sctu.java.day0930;

public class Test {


    public static void main(String[] args) throws InterruptedException {
        int i=0;
        while (true) {
            System.out.println(i++);
            Thread.sleep(100);
            try {
                if (i%5==0) {
                    System.out.println(i / 0);
                }
            }catch (ArithmeticException e){
                System.out.println("除零错误！");
            }catch (Exception e){
                System.out.println("出错了！");
            }
        }
        }
            }
