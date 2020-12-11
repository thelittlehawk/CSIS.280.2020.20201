package ba.edu.ssst.csis280;

public class Student extends ReaderBaseClass {
    private String name;

    public Student() {
        this.name = "";
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void processFromString(String line) {
        this.name = line;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
