public class Person {
    String name = "杨修伟";
    int age = 18;
    String sex = "男";
    int height = 170;
    int weight = 110;

    public void study() {
        System.out.println(name+"Studing");
    }
    public void run() {
        System.out.println(name+"running");
    }
    public void watch() {
        System.out.println(name+"watching");
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.sex);
        System.out.println(p.age);
        System.out.println(p.height);
        System.out.println(p.weight);
        p.study();
        p.run();
        p.watch();
    }
}
