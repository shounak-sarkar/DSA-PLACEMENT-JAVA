package MonotonicStack;
import Arrays.ArrayUtil;
import java.util.*;

public class NextGreaterElement2 {
    public static int[] nextGreaterElements(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int N=nums.length;
        int[] res=new int[N];
        // Initialize res[] to -1 directly
        for (int i = 0; i < N; i++) {
            res[i] = -1;
        }
        for(int i=2*N-1;i>=0;i--){
            int index=i%N;
            while(!st.isEmpty() && st.peek() <= nums[index] ){
                st.pop();
            }
            if(i<N){
                if (!st.isEmpty()) {
          res[index] = st.peek();
}
            }
                    st.push(nums[index]);
        }
                return res;
    }

    public static void main(String[] args) {
        int [] arr={6,0,8,1,3};
        ArrayUtil arrayUtil=new ArrayUtil();
//        nge=findNextGreaterElements_usingArray(arr);
        int[] nge=nextGreaterElements(arr);
        System.out.print("Original Array Elements are : ");
        arrayUtil.printArr(arr);
        System.out.print("Next Greater Elements are : ");
        arrayUtil.printArr(nge);
    }
}
