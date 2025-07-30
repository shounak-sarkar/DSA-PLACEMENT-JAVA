package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckArraySort {
    private static boolean isArraySorted(int[] arr,int n){
        // Base case: If we've reached the first element (or before), it's sorted so far
        if (n <= 0) return true;
        if (arr[n] < arr[n-1]){
            return false;
        }
        return isArraySorted(arr,n-1);

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,3,2,4,5};

        boolean forA= isArraySorted(a,a.length-1);
        boolean forB= isArraySorted(b,b.length-1);
        ArrayList<Integer> ar = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> br = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));


        System.out.println(ar+ ((forA?" is Sorted ":" is Not Sorted")));
        System.out.println(br+ ((forB?" is Sorted ":" is Not Sorted")));


    }
}
