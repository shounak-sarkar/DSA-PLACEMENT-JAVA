public class LowerUpperBound {
    static int findLowerBound(int[] arr,int x){
        int low = 0 , high = arr.length - 1;
        int ans =arr.length;

        while(low <= high){
            int mid = (low+high) / 2;

              if (arr[mid] >= x){
                ans= mid ;
                high=mid-1;
            }
            else low = mid + 1;
        }
        return ans;
    }

    static int findUpperBound(int[] arr,int x){
        int low = 0 , high = arr.length - 1;
        int ans =arr.length;

        while(low <= high){
            int mid = (low+high) / 2;

            if (arr[mid] > x){
                ans= mid ;
                high=mid-1;
            }
            else low = mid + 1;
        }
        return ans;
    }



    public static void main(String[] args) {

        int [] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 10 ;
        System.out.println("Lower Bound is "+findLowerBound(arr,x));
        System.out.println("Lower Bound is "+findUpperBound(arr,x));
    }
}
