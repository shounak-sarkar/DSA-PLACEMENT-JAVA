public class subArray {
    //code that returns the longest subarray with given "sum k"  from a given array
    public static int subArray(int[] arr,int k){
        int n = arr.length;
        int len=0;
        int j ;
        for (int i = 0 ; i < n ; i++){
            int sumK=0;
            for (j = i ; j < n ;j++)
            {
                sumK+=arr[i];
                if (sumK==k) len = Math.max(len,j - i + 1 );
            }
        }
        return len;
    }
    public static int longestSubArrayOpt(int[] arr,int k){
        int n = arr.length;
        int i = 0 , j = 0;
        long sum = 0;
        int maxLen=0;
        while(j < n){
            sum+= arr[j];
            while (i <= j && sum > k){
                sum = sum - arr[i];
                i++;
            }
            if (sum == k){
                maxLen = Math.max(maxLen,j - i + 1);
            }
            j++;
            
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,1,9};
        int k = 10;
        int len= longestSubArrayOpt(arr, k);
        System.out.println("The length of the longest subarray is : "+len);

    }
    
}
