import java.util.Collections;
import java.util.ArrayList;
public class maxones {
    public static int countOneBrute(int nums[]){
        ArrayList<Integer> countList= new ArrayList<>();
        int count=0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i]==1){
                count++;
            }else
            {
                //handle cases when there are no conc 1 present 
                if (count>0) countList.add(count);
                count=0;
            }
        }
        // Handle the case where the array ends with 1s
        if (count > 0) {
            countList.add(count);
        }
        return countList.isEmpty() ? 0 : Collections.max(countList);
    }
    public static int countOneBetter(int nums[]){
        int c1=0,c2=0;
        for (int i = 0;i < nums.length;i++){
            if (nums[i]==1){
                c1++;
            }else {
                c2=Math.max(c1, c2);
                c1=0;
            }
        }
         // Ensure the last sequence of 1s is considered
        c2 = Math.max(c1, c2);
        return c2;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1,0,1,1,1,2,3,1,1,1,1,1,1,2,3,1,1,2,11,1};
        int [] arr1= {1,1,1,1};
        int [] arr2= {1,0,0,0,0,0};
        int[] arr3={1,1,0,1,1,1};
        System.out.println("Max Number of 1s in the array is "+countOneBetter(nums));
        System.out.println("Max Number of 1s in the array is "+countOneBetter(arr1));
        System.out.println("Max Number of 1s in the array is "+countOneBetter(arr2));
        System.out.println("Max Number of 1s in the array is "+countOneBetter(arr3));

    }   
}