package ba.edu.ssst.csis280;

public class Student {
    private String firstName;
    private String lastName;
    private String courseName;
    private int grade;

    public Student(String firstName, String lastName, String courseName, Integer grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
