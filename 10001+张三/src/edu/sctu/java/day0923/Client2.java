package edu.sctu.java.day0923;

import java.util.ArrayList;
import java.util.List;

public class Client2 {

    public static void main(String[] args) {

        PersonAction chen = new Person();
        chen.study();


        PersonAction zz = new Developer();

//        List<String> list = new ArrayList<>();

        PersonAction zhen = new Worker();
        zhen.study();

    }
}
