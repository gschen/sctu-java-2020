package 实验二.Test10;

public class Client {
    public static void main(String[] args) {
        // 实例化类
        People people = new People();
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeiJingPeople beiJingPeople = new BeiJingPeople();

        // 调用方法
        people.name="people";
        people.eat();

        chinaPeople.name="chinesePeople";
        chinaPeople.eat();

        americanPeople.name="americanPeople";
        americanPeople.eat();

        beiJingPeople.name="beijingPeople";
        beiJingPeople.eat();
    }
}
