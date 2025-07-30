import java.util.*;
public class sortarrayof0s1s2s {
    public static void sortColors(int[] nums) {
        int i = 0, j = 0, c0 = 0, c1 = 0, c2 = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) c0 += 1;
            else if (nums[i] == 1) c1 += 1;
            else if (nums[i] == 2) c2 += 1;
        }
        //fill with zeros
        for (i = 0; i < c0; i++) {
            nums[i] = 0;
        }
        // fill with 1s
        for (i = c0 ; i < c0+c1; i++) {
            nums[i] = 1;
        }
        // fill with 2s
        for (i = c0+c1 ; i < c0+c1+c2; i++) {
            nums[i] = 2;
        }
    }
    public static void sortColorDNF(int[] nums){
        int low = 0, high = nums.length-1 , mid = 0;
        while(mid <= high){
            //for 0
            if(nums[mid]==0) {
                ArrayFns.Swap(nums,low,mid);
                low++;
                mid++;
            }
            //for 1
            else if (nums[mid] == 1){ //else if used to avoid unnecessary checks
              mid++;
            }
            // for 2
            else{
                ArrayFns.Swap(nums,mid,high);
                high--;
            }
        }
    }

        public static void main(String[] args){
            int[] nums={2,0,2,1,1,0};
            System.out.print("OG array : ");
            ArrayFns.printArray(nums);
            //sortColors(nums);
            sortColorDNF(nums);
            System.out.print("\nAfter sortin array : ");
            ArrayFns.printArray(nums);

        }


}
