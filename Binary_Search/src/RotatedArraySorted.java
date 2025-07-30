//search in rotated sorted array

public class RotatedArraySorted {

    static int search(int[] nums,int target){
        int left = 0 , right = nums.length-1;

        while(left <= right){
            int mid=(left+right)/2;

            //if target is found
            if(nums[mid] == target) return mid;

            //else check which half is sorted

            if(nums[left] <= nums[mid])//left half is sorted
            {
                //if left half is sorted its left is left
                //check if its present
                if(nums[left] <= target && target < nums[right]){
                    //array is not present in the right half its present in the left
                    right=mid-1;
                }else{
                    left=mid+1; // target is in the right half
                }
            }else{ // right half is sorted
                //if right half is sorted its left is the mid
                if(nums[mid] <= target && target < nums[right]){
                    left=mid+1; //target is in the right half
                }else{
                    right = mid -1 ; //target is in the LEFT half
                }
            }
        }
        return -1;
    }



    public static void main(String[] args){
        int [] arr= {7,8,9,1,2,3,4,5,6};
        int pos = search(arr,8);
        System.out.println((pos!=-1?("Found at index "+pos):("Not Found in the List!!")));
    }
}
