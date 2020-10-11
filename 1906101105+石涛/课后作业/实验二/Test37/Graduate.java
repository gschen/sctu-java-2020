package 实验二.Test37;

public class Graduate extends Student{
    // 构造方法
    public Graduate(String name, String category, int[] curriculumScore) {
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
