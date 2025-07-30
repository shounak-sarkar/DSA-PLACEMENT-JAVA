package arrays_easy;
public class ArrayFns {
    public static void printArray(int arr[]){
        System.out.print("\nArray Elements are { ");
        for (var i : arr){
            System.out.print(i+" ");
        }
        System.out.print("}\n\n");
    }
    public static boolean lSearch(int[] nums,int k){
        for (int i : nums ){
            if (i == k)
                return true;
        }
        return false;
    }
    public static int lSearchCount(int[] nums,int k){
        int count=0;
        for (int i : nums ){
            if (i == k)
                count+=1;
        }
        if (count == 0 ) return -1;
        else return count;
    }
    public static int getMax(int[] arr){
        int maxx = arr[0];
        for (int i : arr){
            if (i>maxx) maxx = i;
        }
        return maxx;
    }
    
}
