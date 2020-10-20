package 实验二;

// 创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，再定义一个方法对这三个变量进行初始化，
// 然后定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
public class Test05 {
    // 属性
    int length;
    int width;
    int height;

    // 构造方法
    public Test05(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // 体积
    public int volume(){
        return length*width*height;
    }

    public static void main(String[] args) {
        Test05 cube = new Test05(3,4,5);

        System.out.println("体积："+cube.volume());
    }
}
