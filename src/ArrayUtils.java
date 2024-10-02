import java.util.Arrays;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4};
        swap(array, 0, 3);
        System.out.println(Arrays.toString(array)); // [4, 2, 3, 1]
    }
}

