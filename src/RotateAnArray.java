
// Create an algorithm that rotate the content of an array to the
// left by 1.
public class RotateAnArray {

    // start with input array. After the rotation
    // new array should have 2,3,4, 5,6,1
    static int[] rotateArray(int[] numbers) {
        // create a new array with the same size as the input
        // array.
        int[] rotated = new int[numbers.length];
        //We careate a new array, the same size as numbers,
        // but with each item in the array set to zero

        // Next, we'll copy the elements from the numbers array
        // to the rotated array, but 1 index to the left
        for (int i = 1; i < numbers.length; i++) {
            // This means we'll set the items at index
            //zero of the rotated array to be the item at index
            // 1 of the numbers array
                    // rotated[0] = numbers[1]
            //We'll also want to set the item at index one
            // of the rotated array to be the item at index 2.
            // of the numbers array.
                    // rotated[1] = numbers[2]
                    // rotated[2] = numbers[3]
                    // rotated[3] = numbers[4]
            // continue untill the end of the array is reached.

            rotated[i - 1] = numbers[i];
            // the above shifts all the content to the left
            // and works for most of our array elemetns,
            // but we'll run into an issue with the first item
            // of the rotated array.
            // If we followed the same pattern, we'd get an index
            // out of bounds exception, since index -1 is invalid.


            // We can accomodate this by setting the last item
            // of the rotated array to be the first item of the numbers array.

        }
        rotated[rotated.length - 1] = numbers[0];
        // Then we'll modify our loop to only set the element
        // at index 1.
        return rotated;

    }
}


// ***********************************************
//static int[] rotateArray(int[] numbers) {
//        // Your code goes here.
//        int[] rotated = new int[numbers.length];
//        for (int i = 1; i < numbers.length; i++) {
//        rotated[i - 1] = numbers[i];
//
//        }
//        rotated[rotated.length - 1] = numbers[0];
//        return rotated;
//        }
//
//        }