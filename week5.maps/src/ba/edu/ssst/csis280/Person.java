package ba.edu.ssst.csis280;

public class Person {
    private String fistName;
    private String lastName;
    private int DOB;

    public Person(String fistName, String lastName, int DOB) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return this.getFistName() + " " + this.getLastName();
    }
}
