package ba.edu.ssst.csis280;

public class OurNumber extends ReaderBaseClass {
    private Number num;

    public OurNumber() { }

    public OurNumber(Number num) {
        this.num = num;
    }

    @Override
    public void processFromString(String line) {
        String[] parts = line.split(", ");
        this.num = Integer.parseInt(parts[2]);
    }

    @Override
    public String toString() {
        return "OurNumber{" +
                "num=" + num +
                '}';
    }
}
