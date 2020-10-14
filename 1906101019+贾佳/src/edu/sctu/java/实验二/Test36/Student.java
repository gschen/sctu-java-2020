package edu.sctu.java.实验二.Test36;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    String name;
    String type;
    List<Integer> course  = new ArrayList<Integer>();
    public void getCourse(int cor,Integer grades){
        course.add(cor,grades);
    }

}
