package edu.work.form;

public class Ladder {

    double upside;
    double downside;
    double high;
    double ladderarea;

    Ladder(double upside,double downside,double high,double ladderarea){

        this.upside = upside;
        this.downside = downside;
        this.high = high;
        this.ladderarea = ladderarea;



    }

    void getladderarea (){
        System.out.println(ladderarea);

    }
}
