package demo0922;

public class Father {
    int age;
    String name;

    void study(){
        System.out.println("过了学习的年龄");
    }
    //重载：参数不同
    void study(String who){
        System.out.println(who+"学习");
    }
    void study(int age){
        System.out.println(age+"岁学习");
        //名字相同，尽管参数不同，所以也会报错，可以写多个参数,所以相同的study方法，不能写同样的参数：
        //eg:  String who  String where
    }

}
