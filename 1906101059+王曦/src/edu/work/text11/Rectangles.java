package edu.work.text11;

public class Rectangles extends Rectangle {

    double sides;

    void getdiagonal(){
        System.out.print(Math.sqrt(2)*sides);
    }

    @Override
    public void printMyWay() {
        System.out.println("sides"+sides);
        System.out.println("getperimter"+sides*4);
        System.out.println("getarea"+sides*sides);
        System.out.println("getdiagonal");
        this.getdiagonal();
    }
}
