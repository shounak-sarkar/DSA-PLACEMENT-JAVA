package Subsequence;

import java.util.ArrayList;

public class subsequenceSumK {
    static int count=0;
    public static void printSubSequenceWhereSumK(int ind, int[] arr, ArrayList<Integer> subList, int sum, int K) {
        if (ind >= arr.length) {
            if (sum == K) System.out.println(subList);
            return;
        }
        //pick the current element
        subList.add(arr[ind]);
        printSubSequenceWhereSumK(ind+1, arr, subList, sum + arr[ind], K);

        //backtrack to remove the last element
        subList.remove(subList.size() - 1);
        printSubSequenceWhereSumK(ind+1, arr, subList, sum, K);
    }

    public static void printSubSequenceWhereSumKOne(int ind, int[] arr, ArrayList<Integer> subList, int sum, int K) {
        if (ind >= arr.length) {
            if (sum == K) {
                System.out.println(subList);
                return;
            }

        }
        //pick the current element
        subList.add(arr[ind]);
        printSubSequenceWhereSumKOne(ind+1, arr, subList, sum + arr[ind], K);

        //backtrack to remove the last element
        subList.remove(subList.size() - 1);
        printSubSequenceWhereSumKOne(ind+1, arr, subList, sum, K);
    }

    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        int tarsum = 9;
        ArrayList<Integer> subList=new ArrayList<>();
        printSubSequenceWhereSumK(0,arr,subList,0,tarsum);
    }
}


