import java.util.HashMap;

public class Cache<K, V> {
    private HashMap<K, V> cache = new HashMap<>();

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>();
        cache.put(1, "First");
        cache.put(1, "Overwritten");
        System.out.println(cache.get(1)); // Overwritten
    }
}

