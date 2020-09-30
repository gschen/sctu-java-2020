package day0923.Work;

public class Address {
    String country;
    String province;
    String city;
    String street;
    int postcode;

    void getAddress(){
        System.out.println(country+province+"省"+city+"市"+street+"邮编："+postcode);
    }

    public static void main(String[] args) {
        Address address=new Address();

        address.country="中国";
        address.province="四川";
        address.city="成都";
        address.street="红岭路";
        address.postcode=610100;

        address.getAddress();
    }
}
