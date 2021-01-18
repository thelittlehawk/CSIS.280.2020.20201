package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class Storage {
    private static Storage instace;
    private ArrayList<Name> names;

    private Storage() {
        this.names = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instace == null) instace = new Storage();
        return instace;
    }

    public void addNewName(Name name) {
        this.names.add(name);
    }

    public ArrayList<Name> getNames() {
        return this.names;
    }
}
