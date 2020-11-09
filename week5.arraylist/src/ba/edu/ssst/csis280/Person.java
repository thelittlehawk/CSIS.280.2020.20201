package ba.edu.ssst.csis280;

public class Person {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    Person(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [" + this.getFirstName() + " " + this.getLastName() + "]";
    }
}
