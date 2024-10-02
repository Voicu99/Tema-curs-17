import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GenericRepository<K, V> {
    private Map<K, V> repository = new HashMap<>();

    public void add(K key, V value) {
        repository.put(key, value);
    }

    public V get(K key) {
        return repository.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericRepository<?, ?> that = (GenericRepository<?, ?>) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    public static void main(String[] args) {
        GenericRepository<String, String> repo = new GenericRepository<>();
        repo.add("1", "First Item");
        repo.add("2", "Second Item");

        System.out.println(repo.get("1")); // First Item
    }
}

