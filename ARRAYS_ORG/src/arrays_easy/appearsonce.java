package arrays_easy;
import java.util.*;
public class appearsonce {
    public static int appearanceOneBrute(int [] arr){

        for (int i = 0 ; i < arr.length ;i++){
            if(ArrayFns.lSearchCount(arr, arr[i])==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static int appearanceOneBetterOne(int [] arr){
        //size of array 
        int n =  arr.length;
        //find tha maximum element : 
        int maxi = ArrayFns.getMax(arr); //O(n)
        int[] hash = new int[maxi+1];
        for(int i = 0 ; i < n ; i++){
            hash[arr[i]]++;
        }

        //find single element and return the answer : O(n)
        for (int i = 0 ; i < n ; i++){
            if(hash[arr[i]] == 1 )
                return arr[i];
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int[] arr = { 1,1,2,3,2,3,4,5,5,6,6};
        System.out.println(appearanceOneBetterOne(arr));
    }
    
}
