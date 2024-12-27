import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class ArrayAlgorithms {
    public static Integer linearSearch(int [] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;
            }
        }
        return null;
    }


// Linear search using java streams
    public static OptionalInt linearSearch2(int [] arr, int item) {
        return  Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        // Linear search arrays
//        int [] arr = {1, 2, 3, 4, 5, 6};
//        System.out.println(linearSearch(arr, 1));
//        System.out.println(linearSearch(arr, 8));

    // Linear search using Java Streams
        int [] arr = {1, 2, 3, 4, 5, 6};
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 8).ifPresent(System.out::println);

    }
}
