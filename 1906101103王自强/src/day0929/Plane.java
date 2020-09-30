package day0929;
import java.util.Scanner;
public class Plane {

    void start() {
        System.out.println("启动");
    }
    void end(){
        System.out.println("关闭");
    }
    void on(){
        System.out.println("运行");
        while (true){
            Scanner scanner=new Scanner(System.in);
            String key=scanner.next();
            if(key.equals("u")){
                up();
            }
            if(key.equals("d")){
                down();
            }
            if(key.equals("l")){
                left();
            }
            if(key.equals("r")){
                right();
            }
            if(key.equals("q")){
                exit();
                break;
            }
        }

    }
    void up(){
        System.out.println("向上");
    }
    void down(){
        System.out.println("向下");
    }
    void left(){
        System.out.println("向左");
    }
    void right(){
        System.out.println("向右");
    }
    void exit(){
        System.out.println("退出");
    }
}
