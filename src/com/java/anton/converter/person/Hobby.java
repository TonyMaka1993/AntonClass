package anton.converter.person;
public class Hobby {
    byte id;
    String name;
    String description;

    public Hobby(byte id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Hobby(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    public byte getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Hobby: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description;
    }
}