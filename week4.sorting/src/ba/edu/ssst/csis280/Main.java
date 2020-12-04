package ba.edu.ssst.csis280;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pacheco, Ivor", 1000));
        employees.add(new Employee("Keller, Eugenia", 6000));
        employees.add(new Employee("Stein, Keefe", 5000));
        employees.add(new Employee("Kent, Ciara", 1000));
        employees.add(new Employee("Acosta, Devin", 2000));
        employees.add(new Employee("Waller, Stone", 3000));

//        [e1, e2, e3, e4, e5, e6]
//        e1.compare(e2)
//        e1.compare(e3)
//        e1.compare(e4)
//        e1.compare(e5)
//        e1.compare(e6)

//        public static void Test(Employee x1, Employee x2) {
//            if (x1.getSalary() > x2.getSalary()) {
//                return 1;
//            } else {
//                return -1;
//            }
//        }

        int[] a = new int[] { 1, 2, 3, 4, 5};
        employees.sort((x1, x2) -> {
            if (x1.getSalary() > x2.getSalary()) {
                return 1;
            } else {
                return -1;
            }
        });

        // employees.sort((x1, x2) -> x1.getSalary() > x2.getSalary() ? -1 : 1);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
