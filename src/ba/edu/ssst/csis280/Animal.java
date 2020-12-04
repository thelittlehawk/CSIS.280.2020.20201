package ba.edu.ssst.csis280;

public class Animal {
    private final String name;
    private final String type;
    private final String sound;

    public Animal(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }
}
