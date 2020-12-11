package ba.edu.ssst.csis280;

public class Wrapper<Template> {
    private Template object;

    public Wrapper() {}

    public Wrapper(Template object) {
        this.object = object;
    }

    public void setObject(Template object) {
        this.object = object;
    }

    public Template getObject() {
        return object;
    }
}
