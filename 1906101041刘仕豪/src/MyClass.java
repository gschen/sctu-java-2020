public class MyClass {

    String name = "xiaoming";
    int walk_speed = 3;
    int run_speed = 6;
    int school_distant = 12;

    public static void main(String[] args) {
        MyClass MC = new MyClass();
        MC.walkToSchool();
        MC.runToSchool();
    }


    void walkToSchool(){
        System.out.println("从家走到学校需要"+school_distant/walk_speed+"分钟");
    }

    void runToSchool(){
        System.out.println("从家跑到学校需要"+school_distant/run_speed+"分钟");
    }

}
