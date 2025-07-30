package arrays_easy;
import java.util.ArrayList;
public class leftrotate {
    public static int[] leftRotateOne(int arr[],int n){
        int temp=arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static int[] leftRotateKBRute(int arr[],int n,int k){
        int g=0;
        while (g<k){
        int temp=arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        g++;
    }
    return arr;
}
    public static int[] leftRotateKBetter(int arr[],int n , int k){
        
         ArrayList<Integer> temp =new ArrayList<>();
        //store the first K elements
        for (int i = 0 ; i < k ; i ++ ){
            temp.add(arr[i]);
        }
        //perform the rotation from K th place
        for(int i = k ; i < n ; i++){
            arr[i-k]=arr[i];
        }
        //add the temporary stored first K elements to the end of the array 
        int j=0;
        for (int i = n-k ; i< n ; i++){
             arr[i]=temp.get(j);
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Original Array ");
        ArrayFns.printArray(arr);
        // arr=leftRotateOne(arr, arr.length);
        int k = 5;
        System.out.println("After Rotation Array by "+k+" places ");
        arr=leftRotateKBetter(arr,arr.length, k);
        ArrayFns.printArray(arr);

    }
}
