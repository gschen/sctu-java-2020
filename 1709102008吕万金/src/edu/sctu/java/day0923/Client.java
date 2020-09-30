package edu.sctu.java.day0923;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PersonAction chen =new Person();
        chen.study();

        PersonAction zhen =new Worker();
        zhen.study();


        PersonAction zz=new Client2();
        zz.study();

        List<String> list=new ArrayList<>();
    }
}
