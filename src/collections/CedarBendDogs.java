package collections;

import java.util.ArrayList;

public class CedarBendDogs {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Mowgli", 50));
        dogs.add(new Dog("Oreo", 100));
        dogs.add(new Dog("Blue" , 70));
        dogs.add(new Dog("Snowy", 10));
        for(Dog dog : dogs )
        {
            System.out.println(dog);
        }

    }
}
