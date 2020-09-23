package lesson.day0916;

public class InheritPerson extends Person{

    public static void main(String[] args) {

        InheritPerson i = new InheritPerson();

        i.name = "lily";
//        i.age = 18;  //age变量被声明为private，不能被其他类访问
        i.height = 160;  //height只能被同一个包内的类或子类访问
    }

}
