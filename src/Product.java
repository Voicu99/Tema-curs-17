import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String id;

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0, "P001");
        Product p2 = new Product("Phone", 800.0, "P001");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true

        p2.id = "P002";
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.hashCode() == p2.hashCode()); // false
    }
}

