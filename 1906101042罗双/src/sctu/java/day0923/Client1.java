package sctu.java.day0923;

import java.util.ArrayList;
import java.util.List;

public class Client1 {

    public static void main(String[] args) {

        PersonAction a = new Person();
        a.study();

        PersonAction zz = new Developer();
        zz.study();


        //List<String> list = new ArrayList<>();

        PersonAction b = new Worker();
    }
}
