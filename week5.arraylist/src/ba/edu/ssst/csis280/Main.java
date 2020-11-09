package ba.edu.ssst.csis280;

import java.net.ServerSocket;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Person pStudent = new Student("John", "Doe", 2000, 4);
        Person pEmployee = new Employee("John", "Worker", 1995, 1200.0);

        Group g = new Group("SSST CSIS 280");
        g.addPerson(pStudent);
        g.addPerson(pEmployee);

        GenericGroup<Person> genericGroup = new GenericGroup<>("Generic SSST");
        genericGroup.addElement(pStudent);
        genericGroup.addElement(pEmployee);
        System.out.println(genericGroup);

        GenericGroup<String> strings = new GenericGroup<>("Generic SSST");
        strings.addElement("Test");
        strings.addElement("No.2");
        strings.addElement("3");
        System.out.println(strings);

//        Array
//        arrayApproach(pStudent, pEmployee);

        ArrayList<Person> pArrayList = new ArrayList<Person>();
        System.out.println("Size of ArrayList: " + pArrayList.size());
        pArrayList.add(pStudent);
        System.out.println("Size of ArrayList: " + pArrayList.size());
        pArrayList.add(pEmployee);
        System.out.println("Size of ArrayList: " + pArrayList.size());

        for (Person p: pArrayList) {
            if(p.getClass() == Student.class) {
                System.out.println(p + " Year of study: " + ((Student) p).getYearOfStudy());
            } else {
                System.out.println(p);
            }
        }

        System.out.println("Get element at position 1." + pArrayList.get(1));

        pArrayList.remove(0);
        System.out.println("Size of ArrayList: " + pArrayList.size());

        pArrayList.clear();
        System.out.println("Size of ArrayList (after clear()): " + pArrayList.size());
    }

    private static void arrayApproach(Person pStudent, Person pEmployee) {
        try {
//            Person[] pArray = new Person[] { pStudent, pEmployee };
            Person[] pArray = new Person[3];
            pArray[0] = pStudent;
            pArray[1] = pEmployee;
            pArray[2] = pEmployee;

//            for (int i = 0; i < pArray.length; i++) {
//                Person p = pArray[i];
//                System.out.println(p);
//            }
            for (Person p : pArray) {
                System.out.println(p);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index our of bounds");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
