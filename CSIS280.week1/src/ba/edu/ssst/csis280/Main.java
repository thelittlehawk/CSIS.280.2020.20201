package ba.edu.ssst.csis280;

import java.math.BigInteger;

public class Main {

    public static int pomnozi(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int a = 280;
        String text = "Hello CSIS ";

        System.out.print(text);
        System.out.println(a);

        a = 450;

        for (int inc = 1; inc < 10; inc++) {
            int temp = pomnozi(inc);
            System.out.println(temp);
        }

        Test t = new Test(10);

        t.setA(20);
        t.getA();

        Test.Name();
    }
}
