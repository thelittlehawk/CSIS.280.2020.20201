package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class Student {
    private Integer id;
    private String fullName;
    private Integer yearOfStudy;
    private ArrayList<Course> courses;

    public Student(Integer id, String fullName, Integer yearOfStudy, ArrayList<Course> courses) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfStudy = yearOfStudy;
        this.courses = courses;
    }

    public Integer getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}' + courses;
    }
}
