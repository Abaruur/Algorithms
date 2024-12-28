// In order to optimize a search algorithm, an
// assumption must be made. i.e what if the data was sorted?
// You can start in the middle and then work your way
// towards the beginning or end of the array, depending
// where the items should be located. If the array's data is
// sorted, one algorithm we can use is BINARY SEARCH
//BINARY SEARCH: A dive-and-conquer algorithm where in each
// step it halves the number of elements it has to search through
// Example: {0, 7, 10, 20, 39, 50, 92} the algorithm will start
// at the middle. Depending on whether the item we're searching for
// is greater than or less than the item we're looking at, it will
// continue its search in that portion of the array. Example if the
// the No we are looking for is 50. The algorithm will start at
// search index 3, or item 20. That is the middle of the array.
// Since 20 is less than 50, it would continue its search into
// the 2nd half of the array, with 39, 50, 92. The midpoint of this
// array is 50, which is the item we are looking for. This means
// instead of doing six comparisons, we only had to do 2 to find our
// element.
// Linear Search: No assumptions, O(n) time
// Binary Search: sorted assumptions, O(log(n)) time
// We were only able to do this because of the assumption
// that the array was sorted. IF IT WAS NOT SORTED, then this algorithm
// would not work as expected.


public class BinarySearch {
//    public static boolean binarySearch(int [] arr, int item) {
//        int min = 0;
//        int max = arr.length - 1;
//        while (min <= max) {
//            int mid = (min + max) /2;
//            if (item == arr[mid]) {
//                return true;
//            }else if (item < arr[mid]) {
//                max = mid - 1;
//            } else {
//                min = mid + 1;
//            }
//        }
//        return false;
//    }

    public static int binarySearch2(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length -1;
        while (low <= high){
            int middlePosition = (low + high) /2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            } if(numberToFind < middleNumber){
                high = middlePosition - 1;
            }else {
                high = middlePosition + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
//        int [] ints = {12, 15, 17, 19, 21, 23};

        System.out.println(binarySearch2(arr, 6));
//        System.out.println(binarySearch(arr, 3));
//        System.out.println(binarySearch(arr, 1));
//        System.out.println(binarySearch(arr, 8));
    }
}
