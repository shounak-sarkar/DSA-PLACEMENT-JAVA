package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class binarySearch {
    public static int bin(int [] arr , int low , int high , int target){
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;

        else if (arr[mid] > target ) return bin(arr,low,mid-1,target);
        else if (arr[mid] < target ) return bin(arr,mid+1,high,target);

        return mid;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,3,2,4,5};

        ArrayList<Integer> ar = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> br = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

        int target = 3;
        int target2 = 6;

        int res1=bin(a,0,a.length-1,target);
        int res2=bin(b,0,b.length-1,target2);

        System.out.println((res1==-1)?"Not Found":("Found at "+res1));
        System.out.println((res2==-1)?"Not Found":("Found at "+res2));

    }
}
