package java0299;

public class Ftst {
    int num;
    public void method(){
        System.out.println("我是方法");
    }

    public void method(int num){
        System.out.println("我是方法" + num);
    }

    public static void main(String[] args) {
        Ftst f = new Ftst();
        f.num = 2;
        f.method();
        f.method(f.num);
    }
}
