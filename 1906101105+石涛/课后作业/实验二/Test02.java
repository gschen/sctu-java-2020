package 实验二;

// 设计一个圆形类，可以返回圆的面积与周长
public class Test02 {
    // 返回圆的面积和周长
    String returnCircular(int r){
        double C;
        double S;

        C = Math.PI*2*r; // 周长
        S = Math.PI*Math.pow(r,2); // 面积
        return String.format("周长为：%.2f"+"\n面积为：%.2f",C,S); // 保留两位小数
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();

        System.out.println(test02.returnCircular(1)); // 半径为1的圆
    }
}
