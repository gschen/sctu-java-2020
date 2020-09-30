package day0923.Work;

public class Student {

    String name;
    int age;
    int id;
    String sex;
    String specialities;
    double mathGrade;
    double englishGrade;
    double computerGrade;


    void getTotalSore(){
        System.out.println(mathGrade+englishGrade+computerGrade);
    }
    void getAverageSore(){
        double averageSore=(mathGrade+englishGrade+computerGrade)/3;
        System.out.println(averageSore);
    }
    void getMaxSore(){
        double [] sores={mathGrade,englishGrade,computerGrade};
        double maxSore=sores[0];
        for (double sore : sores) {
            if (maxSore < sore) {
                maxSore = sore;
            }
        }
        System.out.println(maxSore);
    }
    void getMinSore(){
        double [] sores={mathGrade,englishGrade,computerGrade};
        double minSore=sores[0];
        for(double sore : sores){
            if(minSore>sore){
                minSore=sore;
            }
        }
        System.out.println(minSore);
    }
    void getInf(){
        System.out.println("Id:"+id+" "+name+" 性别:"+sex+" 年龄:"+age+" 专业："+specialities);
    }

    public static void main(String[] args) {
        Student student=new Student();

        student.name="张三";
        student.id=1001;
        student.age=18;
        student.specialities="信管";
        student.sex="男";
        student.computerGrade=80;
        student.englishGrade=60;
        student.mathGrade=90;

        student.getAverageSore();
        student.getTotalSore();
        student.getMaxSore();
        student.getMinSore();
        student.getInf();
    }
}
