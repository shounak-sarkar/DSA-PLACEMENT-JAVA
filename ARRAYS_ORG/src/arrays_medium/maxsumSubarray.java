package arrays_medium;

import java.sql.Array;
import java.util.ArrayList;

public class maxsumSubarray {
    public static void countSubArray(int[] arr){
        int count=0;
        ArrayList<ArrayList<Integer>> subarrayslist=new ArrayList<>();
        for (int i =0 ; i< arr.length;i++){
            for (int j =i ; j < arr.length ; j++){
                ArrayList<Integer> subarray=new ArrayList<>();
                for (int k=i ;  k <=j ; k++) {
                    subarray.add(arr[k]);
                }
                subarrayslist.add(subarray);
            }
        }
        System.out.println("Number of possible subarrays are : "+subarrayslist);
    }
    public static void countSubArraySliding(int[] arr) {
            ArrayList<ArrayList<Integer>> subarrayslist = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                for (int j = i; j < arr.length; j++) {
                    subarray.add(arr[j]); // Extend the existing subarray
                    subarrayslist.add(new ArrayList<>(subarray)); // Store a copy
                }
            }
            System.out.println("Number of possible subarrays: " + subarrayslist.size());
            System.out.println(subarrayslist);
        }

    public static void subArrayMaxSumBrute(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> subarray = new ArrayList<>();
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.println("Max Subarray Sum is "+maxSum);
    }

    public static void kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int num : arr) {
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        {
            //int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
            int [] arr={1,-2,2,3,-4};
            ArrayFns.printArray(arr);
            kadane(arr);
        }
    }
}



