package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) {
	    System.out.println("START OF PROGRAM");

	    Student student = new Student("My First Name", "My Last Name");
	    student.setLastName("Super");

        Student newStudent = new Student("My New First Name", "My New Last Name");
        newStudent.setFirstName("Master");

	    System.out.println(student);
        System.out.println(newStudent);
    }
}
