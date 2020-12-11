package ba.edu.ssst.csis280;

public class NumberWrapper<Template extends Number> {
    private Template object;

    public NumberWrapper() {}

    public NumberWrapper(Template object) {
        this.object = object;
    }

    public void setObject(Template object) {
        this.object = object;
    }

    public Template getObject() {
        return object;
    }
}
