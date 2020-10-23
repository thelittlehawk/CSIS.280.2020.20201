package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("Simple shape");
        System.out.println(shape);

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);

        Square square = new Square(20);
        System.out.println(square);
    }
}
