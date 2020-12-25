package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) {
//        new Pizza("Tomato", "Cheese");
//
//        new Pizza("Tomato", "Cheese", "Meat");
//
//        new Pizza("Tomato", "Beans", "Origano");

        Pizza pizza1 = new Pizza.Make("Empty pizza")
                .cook();

        Pizza pizza2 = new Pizza.Make("Simple")
                .withSauce("Tomato")
                .withMeat("Turkey")
                .addIngredient("Origano")
                .cook();

        Pizza pizza3 = new Pizza.Make("Simple")
                .addIngredient("Olive")
                .addIngredient("Beans")
                .withSauce("White")
                .cook();

        Pizza pizza4 = new Pizza.Make("Meat only")
                .withMeat("Chicken")
                .cook();

        pizza1.display();
        pizza2.display();
        pizza3.display();
        pizza4.display();
    }
}
