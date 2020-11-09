package ba.edu.ssst.csis280;

import java.awt.*;
import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Person> pArrayList;

    Group(String name) {
        this.name = name;
        this.pArrayList = new ArrayList<>();
    }

    public void addPerson(Person p) {
        this.pArrayList.add(p);
    }

    @Override
    public String toString() {
        String out = "";
        for (Person p : pArrayList) {
            out += p + ", ";
        }
        return out;
    }
}
