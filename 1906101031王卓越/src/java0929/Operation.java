package java0929;

public class Operation implements PlantFly{
    @Override
    public void start(){
        System.out.println("开始飞行");
    }

    public void shutdown(){
        System.out.println("停止飞行");
    }

    public void run(){
        System.out.println("正在飞行");
    }

    public void up(){
        System.out.println("向上飞");
    }

    public  void down(){
        System.out.println("向下飞");
    }

    public  void  left(){
        System.out.println("向左飞");
    }

    public void right(){
        System.out.println("向右飞");
    }

    public  void exit(){
        System.out.println("退出");
    }
}
