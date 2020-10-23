package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) {

        String[] elements = { "Element No.1", "Element No.2" };
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        numbers[0] = 100;
        numbers[1] = 111;

        System.out.println("For loop over elements");
        for (int i = 0; i < elements.length; i++) {
            String oneElement = elements[i];
            // {
            System.out.println(oneElement);
            // }
        }
        System.out.println("For each loop over elements");
        for (String oneElement : elements) {
            System.out.println(oneElement);
        }

        System.out.println("For loop over numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
