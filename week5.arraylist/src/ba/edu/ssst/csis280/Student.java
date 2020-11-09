package ba.edu.ssst.csis280;

public class Student extends Person {
    private int yearOfStudy;

    public Student(String firstName, String lastName, int yearOfBirth, int yearOfStudy) {
        super(firstName, lastName, yearOfBirth);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student [" + this.getFirstName() + " " + this.getLastName() + "]";
    }
}
