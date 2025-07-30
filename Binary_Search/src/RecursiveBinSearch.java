import java.util.LinkedHashMap;

public class RecursiveBinSearch {

    static int searchBin(int nums[] ,int low ,int high ,int target){
        if (low > high)  // ✅ Base case: If range is invalid, target not found
            return -1;

        int mid = (low + high) / 2;


        if (nums[mid] == target) return mid;
        else if ( nums[mid] > target ) return searchBin(nums,low,mid-1,target);
        else return searchBin(nums,mid+1,high,target);

    }


    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> ans = new LinkedHashMap<>();

        int [] nums={1, 5, 12, 15, 26, 124, 125, 235, 12345, 23465};
        int key = 12345;
        int pos = searchBin(nums,0, nums.length-1, key);
        System.out.println("Here is the search results ");
        System.out.println(pos);

    }
}
