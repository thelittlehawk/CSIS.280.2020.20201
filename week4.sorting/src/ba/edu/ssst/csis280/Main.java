package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pacheco, Ivor", 1000));
        employees.add(new Employee("Keller, Eugenia", 6000));
        employees.add(new Employee("Stein, Keefe", 5000));
        employees.add(new Employee("Kent, Ciara", 1000));
        employees.add(new Employee("Acosta, Devin", 2000));
        employees.add(new Employee("Waller, Stone", 3000));

        employees.sort((x, y) -> {
            if (x.getSalary() > y.getSalary()) {
                return -1;
            } else {
                return 1;
            }
        });

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
