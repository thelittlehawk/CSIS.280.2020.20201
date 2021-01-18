package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class MakeInitials implements Runnable {
    private ArrayList<Name> names;

    public MakeInitials(ArrayList<Name> names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (Name name: names) {
            name.createInitials();
            Storage.getInstance().addNewName(name);
        }
    }
}
