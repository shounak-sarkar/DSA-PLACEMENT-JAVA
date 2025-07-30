package arrays_easy;
import java.util.ArrayList;

public class checkifsortedRotated {
    public static boolean check(int m[],int n){
        int i = 1;
        while(i<n){
            if (m[i] > m[i-1]){
                i++;    
            }
            else 
                return false;
        }
        return true;
    }
    public static int[] leftRotateKBetter(int arr[],int n , int k){
        
         ArrayList<Integer> temp =new ArrayList<>();
        //store the first K elements
        for (int i = 0 ; i < k ; i ++ ){
            temp.add(arr[i]);
        }
        //perform the rotation from K th place
        for(int i = k ; i < n ; i++){
            arr[i-k]=arr[i];
        }
        //add the temporary stored first K elements to the end of the array 
        int j=0;
        for (int i = n-k ; i< n ; i++){
             arr[i]=temp.get(j);
            j++;
        }
        return arr;
    }
    public static boolean check(int[] nums){

        return false ;
    }
    public static void main(String args[])
    {
        
    }
}
