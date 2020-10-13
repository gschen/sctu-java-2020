package day0916;

public class Person {
    public String name;
    private int age;

    public int getAge() {
        System.out.println(age);
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }



    protected int height;




    void study(){
        System.out.println(name+"正在学习");
        System.out.println(height+"斤的"+name+"正在学习");
        System.out.println(age);
    }


}
