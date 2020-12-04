package ba.edu.ssst.csis280;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("Random Name", 2000);
        Company com = new Company("Random Inc.", 20000);

        InternationalCompany icom = new InternationalCompany("Random LLC", 125000);

        displayEarnings(emp);
        displayEarnings(com);
        displayEarnings(icom);
    }

    private static void displayEarnings(IEarnings emp) {
        System.out.println(emp + " " + emp.total());
    }
}
