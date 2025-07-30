package arrays_medium;
import java.util.*;
public class longestSequence {
    public static boolean lSearch(int[] nums,int k){
        for (int i : nums ){
            if (i == k)
                return true;
        }
        return false;
    }
    public static int longestSequenceBrute(int[] arr) {
        int maxLen = 0;

        // For every element in the array, try to build a consecutive sequence.
        for (int i = 0; i < arr.length; i++) {
            int currentLen = 1;        // The sequence always has at least arr[i]
            int nextValue = arr[i] + 1;  // The next consecutive number to look for

            // Continue to search for the next consecutive number in the array.
            // ArrayFns.lSearch(arr, value) is assumed to return true if 'value' exists in 'arr'
            while (ArrayFns.lSearch(arr, nextValue)) {
                currentLen++;         // Increase the length of the current sequence
                nextValue++;          // Look for the next consecutive number
            }

            // Update the maximum sequence length if the current one is longer.
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        {
            int arr[]={102,4,100,1,101,3,2,1,1};
        }
    }
}
