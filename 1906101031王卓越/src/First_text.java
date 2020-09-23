public class First_text {
    String name = "张三";
    int age = 18;
    char sex = '男';
    public void study(String s){
        System.out.println(s+"正在学习");
    }
    public void  run(String s){
        System.out.println(s+"正在跑步");
    }
    public  void movie(String s){
        System.out.println(s+"正在看电影");
    }
    public static void main(String[] args) {
        First_text s = new First_text();
        s.study(s.name);
        s.run(s.name);
        s.movie(s.name);
    }
}
