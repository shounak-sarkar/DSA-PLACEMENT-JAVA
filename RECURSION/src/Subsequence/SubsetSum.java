package Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static void printSubSequence(int ind, int[] arr, List<Integer> subList,int sum,int target){
        if(ind>=arr.length) {
            if (sum == target) {
                System.out.print(subList+"  ");
            }
            return;
        }
        //Pick the current element
        subList.add(arr[ind]);
        printSubSequence(ind+1,arr,subList,sum+arr[ind],target);

        //Remove the current element back tracking
//        subList.remove(subList.size()-1);
        subList.removeLast();
        printSubSequence(ind+1,arr,subList,sum,target);
    }

    public static void main(String[] args) {
        // Test Case 1: Finding subsequences that sum to 5
        int[] arr1 = {3, 1, 2, 4, 5};
        int target1 = 5;
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();


        System.out.println("Input Array: " + Arrays.toString(arr1) + ", Target Sum: " + target1);
        System.out.print("Subsequences: ");

        // Start the recursion: index 0, array, empty list, current sum 0, target
        printSubSequence(0, arr1, ans1, 0, target1);
        System.out.println("\n");

        // Test Case 2: Finding subsequences that sum to 8
        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 8;

        System.out.println("Input Array: " + Arrays.toString(arr2) + ", Target Sum: " + target2);
        System.out.print("Subsequences: ");
        printSubSequence(0, arr2, ans2, 0, target2);
    }

}
