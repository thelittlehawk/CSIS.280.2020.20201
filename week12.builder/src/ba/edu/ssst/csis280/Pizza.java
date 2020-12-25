package ba.edu.ssst.csis280;

import javax.swing.plaf.basic.BasicButtonUI;
import java.util.ArrayList;

public class Pizza {
    public static class Make {
        String name;
        String sauceName;
        String meatType;
        ArrayList<String> ingredients;

        public Make(String name) {
            this.name = name;
            this.ingredients = new ArrayList<>();
            this.sauceName = "no";
        }

        public Make withSauce(String sauceName) {
            this.sauceName = sauceName;
            return this;
        }

        public Make withMeat(String meatType) {
            this.meatType = meatType;
            return this;
        }

        public Make addIngredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza cook() {
            Pizza pizza = new Pizza();
            pizza.name = this.name;
            pizza.sauceName = this.sauceName;
            pizza.meatType = this.meatType;
            pizza.ingredients = this.ingredients;
            return pizza;
        }
    }

    private String name;
    private String sauceName;
    private String meatType;
    private ArrayList<String> ingredients;

    private Pizza() { }

    public void display() {
        System.out.println("================================");
        System.out.println("Pizza name: " + this.name);
        if(this.sauceName != "") {
            System.out.println("With " + this.sauceName + " sauce.");
        }
        if(this.meatType != "") {
            System.out.println("With " + this.meatType + " meat.");
        }
        if (this.ingredients.size() > 0) {
           System.out.println("With " + this.ingredients + " ingredients.");
        }
        System.out.println("================================");
    }

    @Override
    public String toString() {
        return "Pizza{" + name + "} " +
                "with " + sauceName + " sauce." +
                "With " + meatType + ".";
    }
}
