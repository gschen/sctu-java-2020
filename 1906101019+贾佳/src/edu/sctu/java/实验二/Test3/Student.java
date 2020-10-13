package edu.sctu.java.实验二.Test3;

public class Student {
    double ComputerGrades;
    double MathGrades;
    double EnglishGrades;

    double total(double englishGrades,double mathGrades,double computerGrades){

        return englishGrades + mathGrades + computerGrades;
    }
    double avg(double englishGrades,double mathGrades,double computerGrades){
        return (englishGrades+mathGrades+computerGrades)/3;
    }
    double max(double englishGrades,double mathGrades,double computerGrades){
        double [] lis = new double[3];
        lis[0] = englishGrades;
        lis[1] = mathGrades;
        lis[2] = computerGrades;
        double max = lis[0];
        for (int i = 1; i < lis.length; i++) {
            if (lis[i]>max){
                max = lis[i];
            }
        }
        return max;
    }
    double min(double englishGrades,double mathGrades,double computerGrades){
        double [] lis = new double[3];
        lis[0] = englishGrades;
        lis[1] = mathGrades;
        lis[2] = computerGrades;
        double min = lis[0];
        for (int i = 1; i < lis.length; i++) {
            if (lis[i]<min){
                min = lis[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Student std = new Student();
        std.ComputerGrades=20.0;
        std.EnglishGrades=30.0;
        std.MathGrades=40.0;
        System.out.println(std.total(std.EnglishGrades,std.MathGrades,std.ComputerGrades));
        System.out.println(std.avg(std.EnglishGrades,std.MathGrades,std.ComputerGrades));
        System.out.println(std.max(std.EnglishGrades,std.MathGrades,std.ComputerGrades));
        System.out.println(std.min(std.EnglishGrades,std.MathGrades,std.ComputerGrades));
    }
}
