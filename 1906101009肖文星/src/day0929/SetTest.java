package day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Animal> animalSet=new HashSet<Animal>();

        Animal dog=new Animal();
        dog.name="kele";

        Animal cat=new Animal();
        cat.name="dundun";

        animalSet.add(dog);
        animalSet.add(dog);
        animalSet.add(dog);
        animalSet.add(cat);
        animalSet.clear();
        animalSet.add(dog);
        animalSet.add(cat);

        for (Animal a:animalSet){
            System.out.println(a.name);
        }

    }
}
