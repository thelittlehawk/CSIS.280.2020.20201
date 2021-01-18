package ba.edu.ssst.csis280;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Name> names = new ArrayList<>();
            File file = new File("names.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(", ");
                Name n = new Name(parts[0].trim(), parts[1].trim());
                names.add(n);
            }

            scanner.close();

            // Threads
            int pivot = (int) Math.ceil(names.size() / 2);

            ArrayList<Name> firstPart = new ArrayList<Name>(names.subList(0, pivot));
            ArrayList<Name> secondPart = new ArrayList<Name>(names.subList(pivot, names.size()));

            MakeInitials miFirstPart = new MakeInitials(firstPart);
            MakeInitials miSecondPart = new MakeInitials(secondPart);

            Thread t1 = new Thread(miFirstPart);
            Thread t2 = new Thread(miSecondPart);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            for (Name name: Storage.getInstance().getNames()) {
                System.out.println(name);
            }
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
