package ba.edu.ssst.csis280;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile<T extends ReaderBaseClass> {
    private String fileName;

    public ReadFromFile(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<T> read(Class<T> internalClass) {
        ArrayList<T> collection = new ArrayList();
        try {
            File f = new File(fileName);
            Scanner scanner = new Scanner(f);
            while(scanner.hasNextLine()) {
                T t = internalClass.newInstance();
                t.processFromString(scanner.nextLine());
                collection.add(t);
            }
            return collection;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return collection;
    }
}
