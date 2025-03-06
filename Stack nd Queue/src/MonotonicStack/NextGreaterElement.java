package MonotonicStack;
import java.lang.reflect.Array;
import java.util.Stack;
import java.util.ArrayList;
import Arrays.ArrayUtil;

public class NextGreaterElement {

    public static ArrayList<Integer> findNextGreaterElements_usingArray(int[] arr){
        ArrayList<Integer> nge=new ArrayList<>();
        if(arr == null || arr.length == 0){
            return nge;
        }
        for (int i = 0 ;i < arr.length ; i++ ){
            boolean found=false;
            for (int j = i+1 ; j< arr.length;j++) {
                if (arr[j] > arr[i]) {
                    nge.add(arr[j]);
                    found = true;
                    break;
                }
            }
                if(!found){
                    nge.add(-1);
                }
            }
        return nge;
        }


    public static ArrayList<Integer> findNextGreaterUsingStack(int[] arr){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> nge=new ArrayList<>();
        
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nge.add(-1);
            else nge.add(st.peek());
        }
        return nge;
    }

    public static void main(String[] args) {
        int [] arr={6,0,8,1,3};
        ArrayList<Integer> nge=new ArrayList<>();
        ArrayUtil arrayUtil=new ArrayUtil();
//        nge=findNextGreaterElements_usingArray(arr);
        nge=findNextGreaterElements_usingArray(arr);
        System.out.print("Original Array Elements are : ");
        arrayUtil.printArr(arr);
        System.out.print("Next Greater Elements are : "+nge+"\n");
    }
}
