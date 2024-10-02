import java.util.Arrays;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {
        // 1. Rectangle equals() and hashCode()
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println(r1.equals(r2)); // true
        System.out.println(r1.hashCode() == r2.hashCode()); // true

        // 2. Person equals() and hashCode()
        Person p1 = new Person("Alice", 25, "alice@example.com");
        Person p2 = new Person("Alice", 25, "alice@another.com");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true

        // 3. Student equals() and hashCode()
        Student s1 = new Student("Bob", 20, "S001", "bob@example.com");
        Student s2 = new Student("Bob", 20, "S002", "bob@example.com");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true

        // 4. Song equals() and hashCode()
        Song song1 = new Song("Imagine", "John Lennon", 183);
        Song song2 = new Song("Imagine", "John Lennon", 200);
        System.out.println(song1.equals(song2)); // true
        System.out.println(song1.hashCode() == song2.hashCode()); // true

        // 5. Product equals() and hashCode()
        Product prod1 = new Product("Laptop", 1200.0, "P001");
        Product prod2 = new Product("Phone", 800.0, "P001");
        System.out.println(prod1.equals(prod2)); // true
        System.out.println(prod1.hashCode() == prod2.hashCode()); // true
        // Removed prod2.setId("P002"); and related tests

        // 6. LightColor enum
        for (LightColor color : LightColor.values()) {
            System.out.println(color + ": " + color.getAction() + " for " + color.getDuration() + " seconds");
        }

        // 7. Entities with different id fields are not equal
        Entity e1 = new Entity("E001", "Entity One", 1620000000L);
        Entity e2 = new Entity("E001", "Entity Two", 1630000000L);
        System.out.println(e1.equals(e2)); // true
        // Removed e2.setId("E002"); and related tests

        // 8. Cache simulation
        Cache<Integer, String> cache = new Cache<>();
        cache.put(1, "First");
        cache.put(1, "Overwritten");
        System.out.println(cache.get(1)); // Overwritten

        //task 9 nu am inteles cum se face

        // 10. toString() method for large dataset summary
        LargeDataset dataset = new LargeDataset(List.of("Item1", "Item2", "Item3", "Item4", "Item5", "Item6"));
        System.out.println(dataset);

        // 11. Swap two elements in an array
        Integer[] array = {1, 2, 3, 4};
        ArrayUtils.swap(array, 0, 3);
        System.out.println(Arrays.toString(array)); // [4, 2, 3, 1]

        // 12. Pair class
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println(pair);

        // 13. Day Scheduler
        DayScheduler scheduler = new DayScheduler();
        scheduler.addActivity(DayScheduler.Day.MONDAY, "Gym");
        scheduler.addActivity(DayScheduler.Day.FRIDAY, "Movie night");
        System.out.println("Monday: " + scheduler.getActivity(DayScheduler.Day.MONDAY));
        System.out.println("Friday: " + scheduler.getActivity(DayScheduler.Day.FRIDAY));

        // 14. Traffic Light Simulation
        for (TrafficLightSimulator.LightState state : TrafficLightSimulator.LightState.values()) {
            System.out.println(state + ": " + state.getAction() + " for " + state.getDuration() + " seconds");
        }

        // 15. Generic Repository using HashMap
        GenericRepository<String, String> repo = new GenericRepository<>();
        repo.add("1", "First Item");
        repo.add("2", "Second Item");
        System.out.println(repo.get("1")); // First Item

        // 16. CarType enum
        for (CarType type : CarType.values()) {
            System.out.println(type);
        }
    }
}


