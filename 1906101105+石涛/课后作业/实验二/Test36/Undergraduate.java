package 实验二.Test36;

public class Undergraduate extends Student{
    // 构造方法
    public Undergraduate(String name, String category, int[] curriculumScore) {
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
        if (a<=100 && a>=80){
            level="优秀";
        }else if(a>=70){
            level="良好";
        }else if (a>60){
            level="一般";
        }else if (a>50){
            level="及格";
        }else if (a>=0 && a<50){
            level="不及格";
        }else {
            level="无";
        }
    }
}
