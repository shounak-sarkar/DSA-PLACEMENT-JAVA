package arrays_easy;
public class missingnumber {
    public static int FindMissingBrute(int arr[],int N){
        for (int i = 1 ; i <= N ;i++){
            if(!ArrayFns.lSearch(arr, i)) return i;
        }
        return -1;
    }
    public static int FindMissingOpt(int arr[],int N){
        int sumN=(N*(N+1)/2),sumG=0;
        for (int i = 0 ; i < arr.length ; i++){
            sumG=sumG+arr[i];
        }
        return (sumN-sumG);
    }
    public static void main(String[] args) {
        {
            int[] arr ={1,2,3,4,5,7};
            //int num = FindMissingBrute(arr,3);
            int num = FindMissingOpt(arr,7);
            System.out.println("Missing number is "+num);
        }
    }
}
