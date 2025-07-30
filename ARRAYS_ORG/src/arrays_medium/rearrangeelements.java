package arrays_medium;
import java.lang.reflect.Array;
import java.util.*;
public class rearrangeelements {
    public static int[] rearrangeelementsBrute(int[] nums)
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        int[] res=new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            if (nums[i]>=0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int poscount=0,negcount=0;
        for (int i = 0 ; i < res.length ; i++){
            if (i%2==0) //even
            {
                res[i]=pos.get(poscount);
                poscount++;
            }
            else
            {
                res[i]=neg.get(negcount);
                negcount++;
            }
        }
        return res;
    }
    public static int[] rearrangeElementsOpt(int[] nums){
        int[] res = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for (int num : nums) {
            if (num >= 0) {
                res[posIndex] = num;
                posIndex += 2;
            } else {
                res[negIndex] = num;
                negIndex += 2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println("The Original Array");
        ArrayFns.printArray(nums);

        int[] res=new int[nums.length];
        res=rearrangeElementsOpt(nums);

        System.out.println("Rearranged Array");
        ArrayFns.printArray(res);

    }
}
