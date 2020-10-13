package 实验二.Test36;

public abstract class Student {
    // 属性
    String name;
    String category;
    int[] curriculumScore;
    String level;

    // 构造方法
    public Student(String name, String category, int[] curriculumScore) {
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
