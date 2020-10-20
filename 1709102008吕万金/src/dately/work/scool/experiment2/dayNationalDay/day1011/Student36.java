package dately.work.scool.experiment2.dayNationalDay.day1011;

public abstract class Student36 {
    String name;
    String category;
    int[] curriculumScore;
    String level;

    // 构造方法
    public Student36(String name, String category, int[] curriculumScore) {
        this.name = name;
        this.category = category;
        this.curriculumScore = curriculumScore;
    }

    // 求平均分
    double average(){
        double sum = 0;
        for (int i : curriculumScore){
            sum+=i;
        }
        return sum/3;
    }

    // 判断等级
    void judgeLevel(){}
}



class PostGraduate36 extends Student36 {
    public PostGraduate36(String name, String category, int[] curriculumScore) {
        super(name, category, curriculumScore);
    }

    // 方法
    @Override
    double average() {
        return super.average();
    }

    // 判断等级
    @Override
    void judgeLevel(){
        double a = average();
        if (a<=100 && a>=90){
            level="优秀";
        }else if(a>=80){
            level="良好";
        }else if (a>70){
            level="一般";
        }else if (a>60){
            level="及格";
        }else if (a>=0 && a<60){
            level="不及格";
        }else {
            level="无";
        }
    }
}


class UnderGraduate36 extends Student36 {
    public UnderGraduate36(String name, String category, int[] curriculumScore) {
        super(name, category, curriculumScore);
    }

    @Override
    double average() {
        return super.average();
    }

    @Override
    void judgeLevel() {
        double a = average();
        if (a > 80 && a <=100){
            level = "优秀";
        }else if (a >= 70){
            level = "良好";
        }else if (a > 60){
            level = "一般";
        }else if (a>50){
            level="及格";
        }else if (a>=0 && a<50){
            level="不及格";
        }else {
            level="无";
        }
    }
}
class T36 {
    public static void main(String[] args) {
        // 实例化对象
        Student36 zhangSan = new UnderGraduate36("张三", "本科生", new int[]{90, 95, 100});
        Student36 liSi = new UnderGraduate36("李四", "本科生", new int[]{80, 85, 90});
        Student36 wangWu = new PostGraduate36("王五", "研究生", new int[]{82, 85, 88});
        Student36 zhaoLiu = new UnderGraduate36("赵六", "本科生", new int[]{75, 82, 87});
        Student36 chenQi = new PostGraduate36("陈七", "研究生", new int[]{80, 82, 84});

        // 储存起来
        Student36[] students = new Student36[]{zhangSan, liSi, wangWu, zhaoLiu, chenQi};

        // 打印信息
        System.out.println("姓名\t\t类型\t\t成绩");
        for (Student36 i : students) {
            i.judgeLevel();
            System.out.println(i.name + "\t\t" + i.category + "\t" + i.level);

        }
    }
}

