package ba.edu.ssst.csis280;

public class Name {
    private String firstName;
    private String lastName;
    private String initials;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = "";
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", initials='" + initials + '\'' +
                '}';
    }

    public void createInitials() {
        this.initials = String.valueOf(this.firstName.charAt(0)) + String.valueOf(this.lastName.charAt(0));
    }
}
