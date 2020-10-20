package edu.sctu.java.实验二.Test10;

public class client {
    public static void main(String[] args) {
        People per = new People();
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericaPeople americaPeople = new AmericaPeople();
        BeijingPeople beijingPeople = new BeijingPeople();
        per.name = "John";
        per.gender = "male";
        per.getInfo();
        chinaPeople.getInfo();
        americaPeople.getInfo();
        beijingPeople.getInfo();
    }
}
