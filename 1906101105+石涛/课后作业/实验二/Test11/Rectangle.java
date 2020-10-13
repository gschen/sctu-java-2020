package 实验二.Test11;

public class Rectangle implements Printx{
    // 属性
    int longs;
    int wide;

    // 重写接口方法
    @Override
    public void printMyWay() {
        System.out.println(String.format("长：%s\n宽：%s\n面积：/s\n周长：/s",
                longs,wide,longs*wide,2*(longs+wide)));
    }
}
