package 实验二.People;


public class Client {
    public static void main(String[] args) {
        People people=new People();
        people.getName();

        ChinaPeople chinaPeople=new ChinaPeople();
        chinaPeople.getName();

        AmericanPeople americanPeople=new AmericanPeople();
        americanPeople.getName();

        BeiJingPeople beiJingPeople=new BeiJingPeople();
        beiJingPeople.getName();

    }
}
