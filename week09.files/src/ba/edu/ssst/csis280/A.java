package ba.edu.ssst.csis280;

public class A {
    B b;

    public A(B b) {
        this.b = b;
    }

    public void update(int broj) {
        this.b.setBroj(broj);
    }

    public B getB() {
        return this.b;
    }
}
