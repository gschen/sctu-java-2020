package dately.work.scool.experiment2.dayNationalDay.day1009;

public class People {
    void wave(){
        System.out.println("People are waving!");
    }

    public static void main(String[] args) {
        AmJericanPeople amJericanPeople=new AmJericanPeople();
        amJericanPeople.wave();

        ChinaPeople chinaPeople=new ChinaPeople();
        chinaPeople.wave();

        BeiJingPeople beiJingPeople=new BeiJingPeople();
        beiJingPeople.wave();
    }
}
