package sctu.java.day0922;

public class Panda extends Animal {

    @Override    //注解 annotation
    void play() {
        //super.play();  //ctrl+x  快速删除
        System.out.println("panda正在玩！");
    }

    public static void main(String[] args) {
        Panda y = new Panda();
        y.name="y";
        y.age=1;
        y.play();



    }
}
//类的设计合理性； overload，override； 发现多态现象