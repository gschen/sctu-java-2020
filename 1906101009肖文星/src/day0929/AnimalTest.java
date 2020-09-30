package day0929;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animalList=new ArrayList<Animal>();

        Animal dog=new Animal();
        dog.name="kele";

        Animal cat=new Animal();
        cat.name="dundun";

        animalList.add(dog);
        animalList.add(cat);
        animalList.remove(dog);

        for (Animal a:animalList){
            System.out.println(a.name);
        }
    }
}
