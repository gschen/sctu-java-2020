package sctu.java.day0923;

public class Animal {
    String name;
    int age;

    void play(){
        System.out.println("animal正在玩！");
    };

    void play(String who){
        System.out.println(who+"正在玩");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.play();
        a.play("a");
    }
}
