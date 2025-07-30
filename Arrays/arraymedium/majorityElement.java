package arraymedium;
public class majorityElement {
    public static int majorityBrute(int[] arr){
        int maxcnt=0;
        int maxcntitem=0;
        for (int i = 0 ; i < arr.length ; i++){
            int cnt=0;
            for(int j = 0 ; j < arr.length ; j++){
                if (j==i) cnt+=1;
            }
            if (cnt>maxcnt) {
                maxcnt=cnt;
                maxcntitem=i;
            }
        }
        return maxcntitem;
    }
    public static void main(String args[]){
        int[] nums={2,2,2,23,3,1,2,2};
        int maxcnt=majorityBrute(nums);
        System.out.println("Max Appearing elements is "+maxcnt);
    }
}
