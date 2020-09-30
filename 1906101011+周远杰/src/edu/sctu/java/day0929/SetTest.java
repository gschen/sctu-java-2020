package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args){

        Set<Doctor> doctorSet = new HashSet<Doctor>();

        Doctor zhou = new Doctor();
        zhou.age=18;

        doctorSet.add(zhou);
        doctorSet.add(zhou);
        doctorSet.add(zhou);

        System.out.println(doctorSet.size());
        System.out.println(doctorSet.contains(zhou));

        for (Doctor d : doctorSet) {
            System.out.println(d.age);
        }

    }

}
