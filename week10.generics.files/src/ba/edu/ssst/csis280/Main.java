package ba.edu.ssst.csis280;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ReadFromFile<OurNumber> numbersReader = new ReadFromFile("numbers.txt");
        ReadFromFile<Student> studentsReader = new ReadFromFile("students.txt");

        ArrayList<OurNumber> numbers = numbersReader.read(OurNumber.class);
        ArrayList<Student> students = studentsReader.read(Student.class);

        System.out.println("numbers");
        System.out.println(numbers);
        System.out.println("students");
        System.out.println(students);
    }
}
