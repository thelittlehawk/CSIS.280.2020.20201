package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) {
        Wrapper<Integer> w = new Wrapper(10);
        System.out.println(w.getObject());

        w.setObject(101);
        System.out.println(w.getObject());

        Wrapper<String> wS = new Wrapper<>("Testera");
        System.out.println(wS.getObject());

        wS.setObject("New test string.");
        System.out.println(wS.getObject());

        // ====
        System.out.println("\n\nwNew");
        Wrapper wNew = new Wrapper();
        wNew.setObject(10);
        System.out.println(wNew.getObject());

        wNew.setObject("101 as String");
        System.out.println(wNew.getObject());

        // ====
        NumberWrapper nW = new NumberWrapper(10.2);
        nW.setObject(10);
        nW.setObject(10.20);

        NumberWrapper<Double> nWDouble = new NumberWrapper(10.2);
        nWDouble.setObject(10.20);
    }
}
