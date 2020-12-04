package ba.edu.ssst.csis280;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** FILES ****");

        readFromFile();
        writeToFile();

        ArrayList<User> users = new ArrayList();
        users.add(new User("Admin", "administrator"));
        users.add(new User("Smith", "user"));
        users.add(new User("John", "user"));


        try {
            writeUsersToAFile(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("USERS FROM A FILE:");
        ArrayList<User> usersFromFile =  readUsersFromAFile();
        for(User user : usersFromFile) {
            System.out.println(user.getClass() + " " + user);
        }
    }

    private static ArrayList<User> readUsersFromAFile() {
        File file = new File("data/users.txt");

        ArrayList<User> usersFromFile = new ArrayList<>();

        if (file.exists()) {
            System.out.println("[file.exists()] I can see it...");

            try {
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String temp = scanner.nextLine();

                    String[] parts = temp.split(",");
                    usersFromFile.add(new User(parts[0].trim(), parts[1].trim()));
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No file :(");
        }

        return usersFromFile;
    }

    private static void writeUsersToAFile(ArrayList<User> users) throws IOException {
        File file = new File("data/users.txt");

        if(!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File exists");
            }
        }

        FileWriter writer = new FileWriter(file);
        for (User user : users) {
            writer.write(user.toString());
            writer.write('\n');
        }
        writer.close();
    }

    private static void writeToFile() {
        File file = new File("data/sample_output_file.txt");

        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File is created!");
                } else {
                    System.out.println("File exists");
                }
            }

            // FileWriter writer = new FileWriter(file.getPath());
            FileWriter writer = new FileWriter(file);
            writer.write("Random text 12345!");
            writer.write('\n');
            writer.write('\n');
            writer.write(80);
            writer.write('\n');
            writer.write('\n');
            writer.write(120 + "");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
        File file = new File("data/sample_file.txt");

        if (file.exists()) {
            System.out.println("[file.exists()] I can see it...");

            try {
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String temp = scanner.nextLine();
                    System.out.println(temp);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No file :(");
        }
    }
}
