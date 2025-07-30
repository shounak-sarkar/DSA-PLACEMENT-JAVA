public class SearchOccurence {
    //BRUTE APPROACH FOR BOTH
    static int getFirstOccur(int[] arr , int targ){
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == targ) return i;
        }
        return -1 ;
    }
    static int getLastOccur(int[] arr , int targ){
        int ans=-1;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == targ) ans=i;
        }
        return ans;
    }

    //Optimised using Bin Searh
    static int getFirstOccurOpt(int[] arr,int target){
        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
        }
        if (arr[mid]=

    }

    public static void main(String[] args) {
        int [] arr = {3,4,6,7,8,8,11};
        int target=8;
        int firstoccur=getFirstOccur(arr,target);
        int lasstoccur=getLastOccur(arr,target);
        System.out.println("First Occurence of " + target + " is at "+firstoccur);
        System.out.println("Last Occurence of "+ target + " is at " +lasstoccur);

    }
}
