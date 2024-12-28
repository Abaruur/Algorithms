import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;
//--Aggregating and filtering data are common programming operations
//--When aggregating data, you combine 2 or more data sets into a
//  single data set.
//--Sometimes when combining these data sets, you will want to filter
//  out data that does not meet your requirements. Example
//  {-9, 3, 2, -8, 12, -16}, {0, -3, -8, -35, 40, 20, 7}. combine these
// 2 arrays to create a new array that combines all the even numbers
// from each array.
//-- there are 3 ways to approach this. 1) Merge arrays and then remove
//  invalid items. 2) Check each element and only keep valid items. 3)
//  Sort each array and take only valid items. We will take the 2nd.



public class AggrigateFilterArrays {

    public static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        for (int num : arr2) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] findEvenNum2(int[] arr1, int[] arr2) {
        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }
    public static void main(String[] args) {
        int[] arr1 = { -9, 3, 2, -8, 12, -16};
        int[] arr2 = {0, -3, -8, -35, 40, 20, 7};

        Arrays.stream(findEvenNums(arr1, arr2)).
                forEach(System.out::println);

        System.out.println();

        Arrays.stream(findEvenNum2(arr1,arr2))
                .forEach(System.out::println);
        }
    }


