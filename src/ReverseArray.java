import java.util.Arrays;

// Technical requirements can change; they aren't permenant
//
public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.stream(reverse(arr))
                .forEach(System.out::println);
    }
}
