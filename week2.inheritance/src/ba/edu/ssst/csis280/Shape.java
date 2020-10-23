package ba.edu.ssst.csis280;

public class Shape extends Object {
    private final String name;

    public Shape() {
        this.name = "<Void Shape>";
    }

    public Shape(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name of the shape is " + this.getName() + ".";
    }
}
