package implementation;
import java.util.*;
public class SlidingWindowMax {


    public static void slidingWindowBrute(int[] arr,int k){
        int n = arr.length;
        ArrayList<Integer> slid=new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            int max=Integer.MIN_VALUE;
            if((i+k)>arr.length) break;
            for(int j = i ; j < (i+k);j++){
                if(arr[j]>max) max=arr[j];
            }
            slid.add(max);
        }
        System.out.println("List of Max Elements "+slid);
    }


//    public static void slidingWindowOpt(int[] arr,int k){
//        int n = arr.length;
//        Deque<Integer> d=new ArrayDeque<>();
//        for(int i = 0 ; i < arr.length;i++){
//            int max=Integer.MIN_VALUE;
//            if((i+k)>arr.length) break;
//            for(int j = i ; j < (i+k);j++){
//                if(arr[j]>max) max=arr[j];
//            }
//            slid.add(max);
//        }
//        System.out.println("List of Max Elements "+slid);
//    }


    public static void main(String[] args) {

        int [] arr={1,3,-1,-3,5,3,2,1,6};
        int [] arr2={3,1,2,4};
        int k=2;
        slidingWindowBrute(arr2,k);

    }

}
