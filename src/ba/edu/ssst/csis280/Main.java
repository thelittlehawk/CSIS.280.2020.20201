package ba.edu.ssst.csis280;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String animalSet[][] = {
                {"Dog", "Domestic", "Bark"},
                {"Cat", "Domestic", "Meow"},
                {"Sheep", "Domestic", "Baaa"},
                {"Fox", "Wild", "???"},
                {"Bear", "Wild", "Roar"},
                {"Snake", "Wild", "Hiss"},
                {"Parrot", "Domestic", "Polly want a cracker"},
                {"Monkey", "Wild", "Monkey noises"}
        };


        ArrayList<Animal> animals = new ArrayList<>();
        for (String[] arrayElement : animalSet) {
            String name = arrayElement[0];
            String type = arrayElement[1];
            String sound = arrayElement[2];

            if (name == "") {
                System.out.println("Missing information");
            } else {
                animals.add(new Animal(name, type, sound));
            }
        }

        Map<String, ArrayList<Animal>> groupedAnimals = new HashMap();

        for (Animal a: animals) {
            if (!groupedAnimals.containsKey(a.getType())) {
                groupedAnimals.put(a.getType(), new ArrayList<>());
            }
            groupedAnimals.get(a.getType()).add(a);
        }

        for (Map.Entry<String, ArrayList<Animal>> entry : groupedAnimals.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (String key : groupedAnimals.keySet()) {
            groupedAnimals.get(key);
        }
    }
}
