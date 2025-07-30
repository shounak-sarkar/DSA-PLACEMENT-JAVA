package MonotonicStack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class SumSubarrayMin {
//    public static int sumSubArrMinBrute(int[] arr) {
//        int n = arr.length;
//        int totalSum = 0;
//        for (int start = 0; start < n; start++) {
//            for (int end = start; end < n; end++) {
//                int minVal = arr[start];
//                for (int i = start; i <= end; i++) {
//                    minVal = Math.min(minVal, arr[i]);
//                }
//                totalSum += minVal;
//            }
//        }
//        return totalSum;
//    }
public static int sumSubArrMinBrute(int[] arr) {
    int n = arr.length;
    int totalSum = 0;
    for (int start = 0; start < n; start++) {
        int mini=arr[start];
        for (int end = start; end < n ; end++) {
            mini = Math.min(mini,arr[end]);
            totalSum+=mini;
        }
    }
    return totalSum;
}




    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        System.out.println("Sum of SubArray Minimum is "+sumSubArrMinBrute(arr));
        ArrayList<Integer> subList= new ArrayList<>();

    }
}
