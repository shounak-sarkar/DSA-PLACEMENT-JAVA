package Subsequence;
import java.util.*;
public class SubsequencePrint {
    static int count=0;
    public static void printSubSequence(int ind,int[] arr,ArrayList<Integer> subList){
        if(ind>=arr.length) {
            count++;
            System.out.print(subList+"  ");
            return;
        }
        //Pick the current element
        subList.add(arr[ind]);
        printSubSequence(ind+1,arr,subList);

        //Remove the current element back tracking

        subList.remove(subList.size()-1);
        printSubSequence(ind+1,arr,subList);
    }



    public static void main(String[] args) {
        int [] arr={1,2,2};
        ArrayList<Integer> subList=new ArrayList<>();

        printSubSequence(0,arr,subList);
        System.out.println("\nNumber of Subs " +count);
    }
}
