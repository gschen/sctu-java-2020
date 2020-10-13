package edu.sctu.java.实验二.Test1;

public class Location {
    String Country;
    String Province;
    String City;
    String Street;
    int Mailcode;

    public static void main(String[] args) {
        Location loc = new Location();
        loc.Country = "China";
        loc.Province = "Sichuan";
        loc.City = "ChengDu";
        loc.Street = "Longpin";
        loc.Mailcode = 621000;
    }
}
