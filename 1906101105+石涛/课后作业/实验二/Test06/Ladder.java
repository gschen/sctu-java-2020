package 实验二.Test06;

// 具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
public class Ladder {
    // 属性
    double top;
    double bottom;
    boolean height;
    boolean S;

    // 构造函数
    public Ladder(double top, double bottom, boolean height, boolean s) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        S = s;
    }

    // 返回面积
    public boolean returnArea(){
        return S;
    }
}
