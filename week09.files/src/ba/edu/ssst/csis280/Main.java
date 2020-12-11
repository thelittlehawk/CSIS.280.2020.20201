package ba.edu.ssst.csis280;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        B b = new B(7);

        A a = new A(b);

        System.out.println(a.getB().getBroj());

        a.update(200);

        System.out.println(b.getBroj());

        Map<Integer, ArrayList<Course>> courses = new HashMap<>();

        courses.put(1, new ArrayList<>());
        courses.get(1).add(new Course("CS110 Programming and Problem Solving I"));
        courses.get(1).add(new Course("CS120 Introduction to Computer Systems"));
        courses.get(1).add(new Course("Math150 Calculus"));
        courses.get(1).add(new Course("LANG121E Language (English)"));
        courses.get(1).add(new Course("LANG121G Language (German)"));

        ArrayList<Student> students = new ArrayList();
        try {
            File file = new File("students.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if(parts.length != 3) {
                    System.out.println("Wrong format of input string.");
                } else {
                    Integer id = Integer.parseInt(parts[0].trim());
                    String fullName = parts[1].trim();
                    Integer yearOfStudy = Integer.parseInt(parts[2].trim());
                    students.add(new Student(id, fullName, yearOfStudy, new ArrayList<Course>(courses.get(1))));
                    if(courses.get(1).size() > 2 ) {
                        courses.get(1).remove(0);
                    }
                }
            }
            scanner.close();
        } catch(FileNotFoundException exception) {
            exception.printStackTrace();
        }

        Map<Integer, ArrayList<Student>> studentsGrouped = new HashMap<>();
        for (Student s : students) {
            if(!studentsGrouped.containsKey(s.getYearOfStudy())) {
                studentsGrouped.put(s.getYearOfStudy(), new ArrayList<>());
            }
            studentsGrouped.get(s.getYearOfStudy()).add(s);
        }

        for(Map.Entry<Integer, ArrayList<Student>> entry : studentsGrouped.entrySet()) {
            try {
                File file = new File("students_" + entry.getKey().toString() + ".txt");
                FileWriter fileWriter = new FileWriter(file);
                for(Student s : entry.getValue()) {
                    fileWriter.write(s.toString());
                    fileWriter.write('\n');
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
