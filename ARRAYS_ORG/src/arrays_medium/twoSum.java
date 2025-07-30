package arrays_medium;
import java.lang.reflect.Array;
import java.util.*;
public class twoSum {
    public static boolean istwoSumBool(int[] arr ,int target){
        int i=0,j=0;
        for (i = 0 ; i < arr.length ; i++){
            for(j=i+1;j<arr.length-1;j++){
                if ((arr[i]+arr[j])==target) return true;
            }
        }
        return false;
    }
    public static  ArrayList<Integer> istwoSumBrute(int[] arr,int target){
        ArrayList<Integer> index=new ArrayList<>();
        int i=0,j=0;
        for (i = 0 ; i < arr.length ; i++){
            for(j=i+1;j<arr.length;j++){
                if ((arr[i]+arr[j])==target) {
                    index.add(i);
                    index.add(j);
                    return index;
                }
            }
        }
        index.add(-1);
        index.add(-1);
        return index;
    }
    public static void main(String[] args)
    {
           ArrayList<Integer> index=new ArrayList<>();
           int[] arr = {2,6,5,8,11};
           int target = 19  ;
//           if(istwoSumBool(arr,target)) System.out.println("YES");
//           else System.out.println("NO");
           index=istwoSumBrute(arr,target);
           System.out.println(index);
    }
}
