package Lab.lab02;

public class Demo01 {

    String country;
    String province;
    String city;
    String street;
    long postcode;


    public static void main(String[] args) {

        Demo01 n = new Demo01();

        n.country = "中国";
        n.province = "四川";
        n.city = "成都";
        n.street = "红岭路";
        n.postcode = 610000;

        System.out.println(n.country);
        System.out.println(n.province);
        System.out.println(n.city);
        System.out.println(n.street);
        System.out.println(n.postcode);
    }
}
