package edu.work;

import edu.sctu.java.day0915.Eaglet;

public class Garde {


    int math;
    int English;
    int Chinese;

    Garde(int math,int English,int Chinese){

        this.math = math;
        this.English = English;
        this.Chinese = Chinese;


    }


    void allgarde(){
        System.out.println(math+English+Chinese);

    }


    void averagegarde(){

        System.out.println((math+English+Chinese)/3);
    }

    void mingarde(){
        int min ;
        min = (math > English?math:English) > Chinese?(math > English?math:English):Chinese;
        System.out.println(min);
    }

    void maxgarde(){
        int max ;
        max = (math < English?math:English) < Chinese?(math < English?math:English):Chinese;
        System.out.println(max);
    }


    void information(){
        System.out.println("math:"+math);
        System.out.println("English:"+English);
        System.out.println("Chinese:"+Chinese);
        System.out.print("allgarde:");this.allgarde();
        System.out.print("averagegarde:");this.averagegarde();
        System.out.print("mingarde:");this.mingarde();
        System.out.print("maxgarde:");this.maxgarde();
    }




    }


