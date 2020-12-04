package ba.edu.ssst.csis280;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] inputData = new String[] {
                "Tabetha, Turberville, CS280, 70",
                "Anastasia, Briner, CS280, 54",
                "Christi, Quisenberry, CSIS280, 33",
                "Lorenza, Giammarino, CSIS280, 65",
                "Anisa, Gatto, CSIS280, 65",
                "Freeda, Dileo, CSIS280, 75",
                "Georgie, Dubuque, CSIS280, 77",
                "Bettie, Klatt, CSIS280, 21",
                "Marcus, Zilnicki, CSIS280, 77",
                "Jodi, Mattei, CSIS280, 34",
                "Eldora, Ruyle, CSIS280, 38",
                "Sharmaine, Umana, CSIS280, 42",
                "Dede, Snelgrove, CSIS280, 58",
                "Valeria, Hamill, CSIS280, 22",
                "Euna, Pavlak, CSIS280, 89",
                "Caroline, Munsterman, CSIS280, 57",
                "Wilfred, Rawlinson, CSIS280, 3",
                "Ouida, Valderrama, CSIS280, 3",
                "Jule, Heyen, CSIS280, 87",
                "Jaimie, Strom, CSIS280, 32",
                "Malindam Judge, CS220, 77",
                "Nidiam Thurmond, CS220, 26",
                "Hedym Beckert, CS220, 26",
                "Ewam Reaux, CS220, 59",
                "Muoim Gourlay, CS220, 63",
                "Saulm Schurman, CS220, 23",
                "Trinhm Skelton, CS220, 44",
                "Rosendom Mcjunkin, CS220, 37",
                "Lonnym Drescher, CS220, 74",
                "Beckym Dileo, CS220, 36",
                "Alfredm Mangini, CS220, 89",
                "Sethm, Peart, CS220, 9",
                "Tarynm, Sartin, CS220, 63",
                "Irvinm, Maestas, CS220, 52",
                "Jaimeem, Gayden, CS220, 61",
                "Julietm, Feliz, CS220, 99",
                "Mym Rase, CS220, 57",
                "Camilam, Breeding, CS220, 48",
                "Kenisham, Osby, CS220, 64",
                "Candicem, Germann, CS220, 91",
                "Euna Pavlak, CS210, 89",
                "Caroline, Munsterman, CS210, 57",
                "Wilfred, Rawlinson, CS210, 61",
                "Ouida, Valderrama, CS210, 55",
                "Jule, Heyen, CS210, 87",
                "Jaimie, Strom, CS210, 78",
                "Malindam, Judge, CS210, 77",
                "Nidiam, Thurmond, CS210, 60",
                "Hedym, Beckert, CS210, 33",
                "Ewam, Reaux, CS210, 59",
                "Muoim, Gourlay, CS210, 63"
        };

        ArrayList<Student> students = new ArrayList<>();

        for (String line : inputData) {
            String[] parts = line.split(", ");
            if(parts.length == 4)
            {
                String firstName = parts[0];
                String lastName = parts[1];
                String courseName = parts[2];
                Integer grade = Integer.parseInt(parts[3]);
                students.add(new Student(firstName, lastName, courseName, grade));
            } else {
                System.out.println("WRONG DATA");
            }
        }

        Map<String, ArrayList<String>> sampleMap = new HashMap<>();
        sampleMap.put("A", new ArrayList<>());
        sampleMap.put("B", new ArrayList<>());
        sampleMap.put("C", new ArrayList<>());
        for (Map.Entry entry : sampleMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (String key : sampleMap.keySet()) {
            System.out.println(key);
        }

        for (String s: "This is, something".split(",| |s")) {
            System.out.println("<" + s + ">");
        }
    }
}
