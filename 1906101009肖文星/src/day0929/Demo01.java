package day0929;



public class Demo01 {
    public static void main(String[] args) {
        Person[] persons=new Person[3];
        for (int i =0;i<3;i++){

            persons[i]=new Person();
            persons[i].study();

        }

    }
}
