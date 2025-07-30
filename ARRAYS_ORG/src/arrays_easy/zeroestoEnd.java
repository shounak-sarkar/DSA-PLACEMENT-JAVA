package arrays_easy;
import java.util.ArrayList;
public class zeroestoEnd {
    public static void moveZeroesEndBrute(int[] nums){
        ArrayList<Integer> temp=new ArrayList<>();
        for (int num : nums ) {
            if (num != 0){
                temp.add(num);
            }
        }
        for (int i = 0 ; i < temp.size() ; i++){
            nums[i]=temp.get(i);
        }
        for (int i = temp.size() ; i < nums.length ; i++ )
        {
            nums[i] = 0;
        }
    }
    public static void swap(int[] arr,int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }
    public static void moveZeroesEndOpt(int[] arr){
        int i = 0 , j = 0;
        while (j < arr.length ){
            if (arr[j] != 0){
                swap(arr,i,j);
                i++;
            }
            j++;
        }
    }
    public static void main(String[] args){
        int nums[] = {1,0,4,0,0,4,0,5,6,12,3,0,2,0,21,0};
        System.out.println("Original Array is ");        
        ArrayFns.printArray(nums);
        System.out.println("Modified Array is ");        
        // moveZeroesEndBrute(nums);
        moveZeroesEndOpt(nums);
        ArrayFns.printArray(nums);
    }
    
}
