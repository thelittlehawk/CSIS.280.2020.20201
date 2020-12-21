package ba.edu.ssst.csis280;

import java.io.File;
import java.util.Scanner;

public class Main {

    static void printOutResult() {
        System.out.println("NAMES");
//        for (String name: Storage.getInstance().getNames()) {
//            System.out.println(name);
//        }

        for (int i = 0; i < Storage.getInstance().totalNames(); i++) {
            System.out.println(Storage.getInstance().getName(i));
        }
    }

    private static void readFormFile() {
        try {
            File file = new File("names.txt");
            Scanner s = new Scanner(file);
            while (s.hasNextLine()){
                String fullName = s.nextLine();
                Storage.getInstance().addNewName(fullName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        readFormFile();
//        printOutResult();

        System.out.print('a');
        System.out.print('\n');
        System.out.print("Ovo je 'nesto'");
        System.out.print("Ovo je \"nesto\"");
    }
}
