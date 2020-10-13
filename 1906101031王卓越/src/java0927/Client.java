package java0927;

public class Client {
    public void pr(){
        String[] names = new String[3];

        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
        }
        persons[0].name = "张三";
    }
    public static void main(String[] args) {
    }

}
