import java.util.Objects;

public class Entity {
    private String id;
    private String name;
    private long timestamp;

    public Entity(String id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Entity e1 = new Entity("E001", "Entity One", 1620000000L);
        Entity e2 = new Entity("E001", "Entity Two", 1630000000L);
        System.out.println(e1.equals(e2)); // true
        e2.id = "E002";
        System.out.println(e1.equals(e2)); // false
    }
}

