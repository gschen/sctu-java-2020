package sctu.java.experiment.Second2;

public class Cube {
    int length;
    int width;
    int height;

    Cube(){}  //构造函数  初始化

    void getVolume(){
        System.out.println("该立方体的体积为"+length*width*height);
    }

    public static void main(String[] args) {
        Cube a = new Cube();
        a.height=3;
        a.length=4;
        a.width=5;
        a.getVolume();
    }

}
