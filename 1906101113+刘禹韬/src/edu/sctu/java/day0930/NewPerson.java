package edu.sctu.java.day0930;

public class NewPerson {

    String name;

    void writeName(){
        for (int i = 0; i<100; i++) {

            try {
                System.out.println(name);

            }catch(NullPointerException e){
                System.out.println("名字为空");
            }catch (Exception e){
                System.out.println("出现错误");
            }


            System.out.println("写了第"+i+"次"+" 完成了"+"%");


        }
    }

    public static void main(String[] args) {
         NewPerson p1 = new NewPerson();

         p1.writeName();
    }

}
