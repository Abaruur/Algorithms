//import java.util.Arrays;
//
//// Technical requirements can change; they aren't permenant
////

//     // Swapping numbers without creating a new array
//    // this reurn void because there is nothing to be returned
//
//        // however, we do run into a problem. If we set the item at
//        // the smaller index be the value of the item at the larger
//        // index, we'll overwrite the value at the smaller index
//        //Befor we do the assigment, we should save the item
//        // at index i in a temp variable.
//
//        // All that's left to do now is assign the item
//        // at the larger index to be the temp
//        arr[arr.length -i - 1] = temp;
//
//


import java.util.Arrays; // Import statement required for Arrays.stream()

public class ReverseArray {
    // Method to create a new reversed array
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Method to reverse the array in place
    public static void reverseInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            // Swap item at index (i) with the item at index (arr.length - i - 1)
            int temp = arr[i]; // Save the item at index i
            arr[i] = arr[arr.length - i - 1]; // Copy item from larger index to smaller index
            arr[arr.length - i - 1] = temp; // Assign the saved value to the larger index
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Uncomment the following lines if you want to test the reverse method
        // Arrays.stream(reverse(arr)).forEach(System.out::println);
        // System.out.println();

        reverseInPlace(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
