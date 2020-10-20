package dately.work.scool.experiment2.dayNationalDay.day1009;

public class Address {
    String country;
    String province;
    String city;
    String stress;
    String postalCode;

    public static void main(String[] args) {
        Address address=new Address();
        address.country="中华人民共和国";
        address.province="四川省";
        address.city="成都市";
        address.stress="龙泉驿区";
        address.postalCode="610100";

        System.out.println(address.country+address.province+address.city+address.stress+",邮政编码是："+address.postalCode);
    }
}
