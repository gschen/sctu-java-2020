package edu.sctu.java.day0930;

public class Test02 {

    public static void main(String[] args) {


        int i = 0;

        while(true){
            // i++  ===   i = i +1
            System.out.println(i++);



            try{
                if (i == 5){
                    System.out.println(10/0);
                }
            }catch (NullPointerException e){
                System.out.println("除零错误！");
            }catch (Exception e){
                System.out.println("错误");
            }

        }
    }
}
