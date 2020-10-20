package edu.sctu.java.day1013;

public class PracticeException {
    public static void main(String[] args) throws  InterruptedException {
        int i = 0;
        while (true){
            System.out.println(i++);
            Thread.sleep(200);
            try {
                if (i == 5){
                    System.out.println(10/0);
                }

            }catch (Exception e){
                System.out.println("出错了");
        }

        }

    }
}
