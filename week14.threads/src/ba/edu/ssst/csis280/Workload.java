package ba.edu.ssst.csis280;

public class Workload implements Runnable {
    private int wait;
    private String work;

    public Workload(int wait, String work) {
        this.wait = wait;
        this.work = work;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(wait);
            System.out.println(work);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
