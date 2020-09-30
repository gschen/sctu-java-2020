package edu.sctu.java.day0929;

import java.util.*;

public class AnimalList {
    public static void main(String[] args) {


        List<Animals> animalsList = new ArrayList<Animals>();
        Animals dog = new Animals();
        dog.name = "dog";
        animalsList.add(dog);
        Animals cat = new Animals();
        cat.name = "cat";
        animalsList.add(cat);
        Animals dog2 = new Animals();
        dog2.name = "dog";
        animalsList.add(dog2);
        Animals bird = new Animals();
        bird.name = "bird";
        animalsList.add(bird);
        Animals cat1 = new Animals();
        cat1.name = "cat";
        animalsList.add(cat1);

        Map<String,Integer> map = new HashMap<String, Integer>();
        for (Animals p : animalsList) {
            Integer times = map.get(p.name);
            if (times == null){
                times =1;
            }else {
                times += 1;
            }

            map.put(p.name, times);
        }

        for (Map.Entry<String ,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
