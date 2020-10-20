package dately.work.scool.experiment2.dayNationalDay.day1011;

public abstract class Student37 {

    String name;
    String category;
    int[] curriculumScore;  //定义一个数组
    boolean pass;

    // 构造方法
    public Student37(String name, String category, int[] curriculumScore) {
        this.name = name;
        this.category = category;
        this.curriculumScore = curriculumScore;
    }

    double average(){
        double sum = 0;
        for (int i : curriculumScore){
            sum+=i;
        }
        return sum/3;
    }


    void judgePass(){

    }
}


class Graduate37 extends Student37{

    public Graduate37(String name, String category, int[] curriculumScore) {
        super(name, category, curriculumScore);
    }

    // 平均分
    @Override
    double average() {
        return super.average();
    }

    // 判断是否通过
    @Override
    void judgePass() {
        if (average()>=80){
            pass = true;
        }
    }
}

class UnderGraduate37 extends Student37 {
    public UnderGraduate37(String name, String category, int[] curriculumScore) {
        super(name, category, curriculumScore);
    }

    @Override
    double average() {
        return super.average();
    }

    // 判断是否通过
    @Override
    void judgePass() {
        if (average()>=60){
            pass = true;
        }
    }

}

class T37 {
    public static void main(String[] args) {
        Student37 Student1 = new UnderGraduate37("张三","本科生",new int[]{80,85,84});
        Student37 Student2 = new Graduate37("李四","研究生",new int[]{80,80,80});

        // 判断是否通过
        Student1.judgePass();
        Student2.judgePass();
        System.out.println("姓名\t\t类型\t\t是否通过");
        System.out.println(Student1.name+"\t\t"+Student1.category+"\t"+Student1.pass);
        System.out.println(Student2.name+"\t\t"+Student2.category+"\t"+Student2.pass);

    }
}

