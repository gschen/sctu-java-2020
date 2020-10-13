package 实验二.Test11;

public class Square extends Rectangle{
    // 属性
    int sideChief;

    // 重写方法
    @Override
    public void printMyWay() {
        System.out.println(String.format("边长：%s\n面积：/s\n周长：/s",
                sideChief,sideChief*sideChief,4*sideChief));
    }
}
