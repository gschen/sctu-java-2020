package sctu.java.day0922;

public class Client2 {
    private static Object Plant;

    public static void main(String[] args) {


        //匿名对象
        Plant c = new Grass();//向上转型


         //alt+enter
        Grass grass = (Grass) c;      //向下转型



    }
}
