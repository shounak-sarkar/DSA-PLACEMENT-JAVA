package arrays_medium;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static int majorityOpt(int[] arr) //moore voting algo
    {
        int cnt=0;
        int el=0;
        for (int i =0 ; i < arr.length;i++)
    {
            if(cnt==0){
                cnt=1;
                el=arr[i];
            }
            else if(arr[i] == el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == el) cnt1++;
        }
        if(cnt1 > arr.length / 2){
            return el;
        }
        return -1;
    }
    public static int majorityBetter(int[] arr) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int cntt = 0;
        //storing the occurence of each elements
        for (int i = 0; i < arr.length; i++) {
            int value = cnt.getOrDefault(arr[i], 0);
            cnt.put(arr[i], value + 1);
        }

        //searching for the majority element
        for (Map.Entry<Integer, Integer> it : cnt.entrySet()) {
            if (it.getValue() > (arr.length / 2)) return it.getKey();
        }
        return-1;
    }
    public static int majorityBrute(int[] arr){
        int maxcnt=0;
        int maxcntitem=0;
        for (int i = 0 ; i < arr.length ; i++){
            int cnt=0;
            for(int j = 0 ; j < arr.length ; j++){
                if (arr[j]==arr[i]) cnt+=1;
            }
            if (cnt>maxcnt) {
                maxcnt=cnt;
                maxcntitem=arr[i];
            }
        }
        return maxcntitem;
    }
    public static void main(String args[]){
        int[] nums={2,2,2,23,3,1,2,2};
//        int maxcnt=majorityBrute(nums);
//        int maxcnt=majorityBetter(nums);
          int maxcnt=majorityOpt(nums);
        System.out.println("Max Appearing elements is "+maxcnt);
    }
}
