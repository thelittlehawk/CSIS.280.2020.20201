package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class GenericGroup<GenericType> {
    private String name;
    private ArrayList<GenericType> pArrayList;

    GenericGroup(String name) {
        this.name = name;
        this.pArrayList = new ArrayList<>();
    }

    public void addElement(GenericType p) {
        this.pArrayList.add(p);
    }

    @Override
    public String toString() {
        String out = "";
        for (GenericType p : pArrayList) {
            out += p + ", ";
        }
        return out;
    }
}
