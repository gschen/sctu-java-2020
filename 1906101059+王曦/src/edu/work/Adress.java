package edu.work;

public class Adress {

    String country;
    String province;
    String city;
    String street;
    String postcode;


    public static void main(String[] args) {

        Circle c = new Circle(3);

        c.area();
        c.perimeter();


        Garde a = new Garde(46,78,90);
        a.information();


        Personnel b = new Personnel("wang",123,2000,100);
        b.allsalary();

        Cube d = new Cube(3,4,5);
        d.getarea();


    }



}
