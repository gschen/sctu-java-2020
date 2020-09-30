package day0916.pac1;

public class StudentA {
    public String name;
    private int age;
    protected int height;
    String hobby;
    public void setAge(int age1){
        this.age=age1;
    }

    public void getAge(){
        System.out.println(age);
    }
    public static class SctuStudent{
        int height;
        void getHeight(){
        }
    }
}
