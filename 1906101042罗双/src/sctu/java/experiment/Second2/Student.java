package sctu.java.experiment.Second2;

public class Student {

    String name;
    double computer;
    double math;
    double english;

    void getAll(){
        double a = computer+math+english;
        System.out.println(name+"的总分为"+a);
    }
    void getAverage(){
        double b = (computer+math+english)/3;
        System.out.println(name+"的平均分为"+b);
    }
    void getTop(){

    }

    public static void main(String[] args) {
        Student aa = new Student();
        aa.name="张三";
        aa.computer=90;
        aa.english=87;
        aa.math=99;
        aa.getAll();
    }
}
