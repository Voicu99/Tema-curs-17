import java.util.List;

public class LargeDataset {
    private List<String> data;

    public LargeDataset(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        int size = data.size();
        return "Dataset contains " + size + " items. First few: " + data.subList(0, Math.min(size, 5));
    }

    public static void main(String[] args) {
        LargeDataset dataset = new LargeDataset(List.of("Item1", "Item2", "Item3", "Item4", "Item5", "Item6"));
        System.out.println(dataset);
    }
}

