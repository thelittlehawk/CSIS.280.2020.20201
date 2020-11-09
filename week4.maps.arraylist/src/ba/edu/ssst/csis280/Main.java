package ba.edu.ssst.csis280;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee("Macdonald", "Simonem", "Egestas Aliquam LLP"));
        employees.add(new Employee("Mills", "Darrelm", "Cursus Et Associates"));
        employees.add(new Employee("Rios", "Kylanm", "Egestas Duis Ac Consulting"));
        employees.add(new Employee("Solis", "Noellem", "Pede PC"));
        employees.add(new Employee("Sparks", "Biancam", "Elit Aliquam Auctor Consulting"));
        employees.add(new Employee("Mcdowell", "Avam", "Dictum LLP"));
        employees.add(new Employee("Rocha", "Wesleym", "Gravida Limited"));
        employees.add(new Employee("Hull", "Cherokeem", "Pede PC"));
        employees.add(new Employee("Smith", "Charlesm", "Ultrices Posuere Cubilia Associates"));
        employees.add(new Employee("Abbott", "Mosesm", "Vulputate Lacus Foundation"));
        employees.add(new Employee("Barrett", "Platom", "Nunc Consulting"));
        employees.add(new Employee("Melton", "Leonardm", "Pede PC"));
        employees.add(new Employee("Shepherd", "Karynm", "Pede PC"));
        employees.add(new Employee("Roach", "Mosesm", "Pede PC"));
        employees.add(new Employee("Salinas", "Ishmaelm", "Diam Luctus Institute"));
        employees.add(new Employee("Moses", "Blythem", "Convallis Erat Incorporated"));
        employees.add(new Employee("Molina", "Maitem", "Dictum Mi Foundation"));
        employees.add(new Employee("Juarez", "Ameliam", "Lobortis Mauris Suspendisse PC"));
        employees.add(new Employee("Mcfadden", "Jinm", "Ligula Industries"));
        employees.add(new Employee("Herman", "Rashadm", "Fames Ac Ltd"));
        employees.add(new Employee("Guthrie", "Chancellorm", "Sit Amet Consectetuer Consulting"));
        employees.add(new Employee("Herman", "Marciam", "Nulla Cras Eu PC"));
        employees.add(new Employee("Kirby", "Castorm", "A Company"));
        employees.add(new Employee("Cortez", "Skylerm", "Curabitur Egestas Nunc Consulting"));
        employees.add(new Employee("Davenport", "Brucem", "Pede PC"));
        employees.add(new Employee("Mcdaniel", "Omarm", "Nulla Cras Eu PC"));
        employees.add(new Employee("Mcdonald", "Kuamem", "Nulla Cras Eu PC"));
        employees.add(new Employee("Barrera", "Orlam", "Nulla Cras Eu PC"));
        employees.add(new Employee("Witt", "Chadwickm", "A Company"));
        employees.add(new Employee("Vinson", "Adriam", "Nulla Cras Eu PC"));
        employees.add(new Employee("Stephenson", "Drewm", "Pede PC"));
        employees.add(new Employee("Hopper", "Blazem", "Pede PC"));
        employees.add(new Employee("Garrison", "Masonm", "Pede PC"));
        employees.add(new Employee("Dejesus", "Hopem", "Pede PC"));


        // Map<Company Name, Total Number>
        Map<String, Integer> employeeCount = new TreeMap<>();
        for (Employee emp : employees ) {
            if (employeeCount.containsKey(emp.getCompany())) {
                employeeCount.put(emp.getCompany(), employeeCount.get(emp.getCompany()) + 1);
            } else {
                employeeCount.put(emp.getCompany(), 1);
            }
        }

        System.out.println("Total number of companies: " + employeeCount.size());

        System.out.println("COPMANIES:");
        for (String key : employeeCount.keySet()) {
            System.out.println(key + " has " + employeeCount.get(key) + " employee(s).");
        }


        // Map<Number of Employees, ArrayList<Company>>
        Map<Integer, ArrayList<String>> employeeCountPerNumber = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : employeeCount.entrySet() ) {
            if (employeeCountPerNumber.containsKey(entry.getValue())) {
                employeeCountPerNumber.get(entry.getValue()).add(entry.getKey());
            } else {
                employeeCountPerNumber.put(entry.getValue(), new ArrayList<String>());
                employeeCountPerNumber.get(entry.getValue()).add(entry.getKey());
            }
        }

        System.out.println("COPMANIES GROUPED BY EMPLOYEE COUNT:");
        for (Integer key : employeeCountPerNumber.keySet()) {
            for (String company : employeeCountPerNumber.get(key)) {
                System.out.println(company + " has " + key + " employee(s).");
            }
        }
    }
}
