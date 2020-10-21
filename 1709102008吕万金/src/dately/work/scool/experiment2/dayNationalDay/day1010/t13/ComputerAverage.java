package dately.work.scool.experiment2.dayNationalDay.day1010.t13;

import java.util.Scanner;

abstract class ComputerAverage {
    abstract double average(int a,double[] data);
}

class Gymnastics extends ComputerAverage{
    double avg,max=0,sum=0;

    Gymnastics(){
    }

    @Override
    double average(int a, double[] data) {
        double min=data[0];
        for(int i=0;i<a;i++){
            if(data[i]>max)//找出最大值
            max=data[i];
         if(data[i]<min)//找出最小值
            min=data[i];
        sum+=data[i];
        }
        avg=(sum-max-min)/(a-2);
        return avg;
        }
    }
class School extends ComputerAverage{
    double sum,avg;
    School(){

    }
    @Override
    double average(int a, double[] data) {
        for (int i=0;i<a;i++)
            sum+=data[i];
            avg=sum/a;
        return avg;
    }
}

class Test5_1 {
    private static Scanner input;
public static void main(String args[]){
    int a;
    input=new Scanner(System.in);
    System.out.println("Please enter the number of subjects:");
    a=input.nextInt();
    double data[] = new double[a];
    System.out.println("Please enter grade:");
    for(int i=0;i<a;i++)
    data[i]=input.nextDouble();
    ComputerAverage avg;
    avg=new Gymnastics();
    System.out.println("Gymnastics:"+avg.average(a,data));
    avg=new School();
    System.out.println("School:"+avg.average(a,data));
    }
}