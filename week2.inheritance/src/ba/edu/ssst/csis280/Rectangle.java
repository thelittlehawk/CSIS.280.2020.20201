package ba.edu.ssst.csis280;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String name) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + " Area is " + this.area() + ".";
    }
}
