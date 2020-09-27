package sctu.java.day0915;

public class Client {
    public static void main(String[] args) {
//        Person luo=new Person();
//        luo.name="luo";
//        luo.age=18;
        Person luo = new Person("luo",18);

        luo.study();
        System.out.println(luo.name);
    }
}
