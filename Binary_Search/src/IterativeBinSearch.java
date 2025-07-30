import java.util.LinkedHashMap;

public class IterativeBinSearch {

    public static int binSearch(int[] nums,int target){
        int low=0,high=nums.length-1;

        while( low <= high )
        {
            int mid = (low + high) /2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> ans = new LinkedHashMap<>();

        int [] nums={1, 5, 12, 15, 26, 124, 125, 235, 12345, 23465};
        int key = 23465;
        for (int num : nums){
            int pos = binSearch(nums,num);
            ans.put(num,pos);
        }
        System.out.println("Here is the search results ");
        System.out.println(ans);

    }
}
