package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class Storage {
    private static Storage instance;

    private ArrayList<String> names;

    private Storage() {
        this.names = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null) instance = new Storage();
        return instance;
    }

    public void addNewName(String newName) {
        this.names.add(newName);
    }

    public String getName(int index) {
        return this.names.get(index);
    }

    public int totalNames() {
        return this.names.size();
    }
}
