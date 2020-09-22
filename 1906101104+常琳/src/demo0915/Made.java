package demo0915;

//demo0909 、demo0915是建立的包，方便对代码进行管理

public class Made {
    //属性
    String name;
    int age;

    //构造函数
    Made(String name,int age){
        this.name = "linda";
        this.age = 20;
    }

    //方法
    void Con_fun(){
        System.out.println("这是一个构造函数");
    }

    void study(){
        System.out.println(name+"在学习编程");
    }

    int add(int a,int b){
        int c;
        c = a + b;
        return c;
    }

}
