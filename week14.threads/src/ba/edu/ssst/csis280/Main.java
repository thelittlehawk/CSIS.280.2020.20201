package ba.edu.ssst.csis280;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Threads example");

        Workload workload1 = new Workload(10, "This is some work to be done. Part 1.");
        Thread thread1 = new Thread(workload1);

        Workload workload2 = new Workload(200000, "This is some work to be done. Part 2.");
        Thread thread2 = new Thread(workload2);

        Workload workload3 = new Workload(0, "This is some work to be done. Part 3.");
        Thread thread3 = new Thread(workload3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Threads are completed.");
    }
}
