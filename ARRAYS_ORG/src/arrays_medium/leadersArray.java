package arrays_medium;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class leadersArray {
    public static ArrayList<Integer> findLeaders(int[] nums){
        ArrayList<Integer> leaders=new ArrayList<>();
        for (int i = 0 ;i<nums.length;i++){
            boolean flag = true;
            for (int j=i+1;j<nums.length;j++){
                if(nums[j] >= nums[i]) flag=false;
            }
            if(flag) leaders.add(nums[i]);
        }
        return leaders;
    }
    public static ArrayList<Integer> findLeadersOpt(int[] nums){
        ArrayList<Integer> leaders=new ArrayList<>();
        int maxel= Integer.MIN_VALUE;
        for (int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i]>maxel){
                maxel=nums[i];
                leaders.add(maxel);
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums={10,22,12,3,0,6};
        ArrayFns.printArray(nums);
        System.out.println("Leaders are : "+ findLeadersOpt(nums));
    }
}
