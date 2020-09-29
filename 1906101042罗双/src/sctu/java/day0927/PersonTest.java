package sctu.java.day0927;

public class PersonTest {

    public static void main(String[] args) {

        Person luo = new Person();
        luo.age=10;
        luo.name="luo";

        //数组
        int a=1;

        //整型（int）数组
        int[] ints = new int[5];
        ints[0]=1;
        ints[1]=2;
        //...
        ints[4]=5;



        Person[] persons = new Person[3];

        for (int i = 0;i<3;i++){
            persons[i] = new Person();
        }
        //persons[0]=new Person();
        persons[0].name="a";
        persons[1].name="b";
        persons[2].name="c";










    }
}
