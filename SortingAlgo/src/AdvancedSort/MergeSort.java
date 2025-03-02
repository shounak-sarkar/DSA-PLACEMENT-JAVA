package AdvancedSort;
import java.util.ArrayList;
import array.array;

public class MergeSort {

    public void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> tmp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        //Merge two sorted halves
        while(left <= mid && right<=high) {
            if (arr[left] < arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                tmp.add(arr[right]);
                right++;
            }
        }

        //copy remaining elements from left half
        while(left<=mid){
            tmp.add(arr[left]);
            left++;
        }

        //copy remaining elements from right half
        while(right<=high){
            tmp.add(arr[right]);
            right++;
        }

        //copy sorted elements back to original array
        int ind=0;
        for (int a : tmp ){
            arr[low+ind]=a;
            ind++;
        }
    }

    public void mergeSort(int[]arr,int low,int high)
    {
        if(low>=high) return;
        int mid=(high+low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        MergeSort m=new MergeSort();
        array Arr=new array();

        int[] arr={3,2,6,1,7,8,10,12};
        System.out.println("Before Sorting :: ");Arr.printArr(arr);
        m.mergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting :: ");Arr.printArr(arr);
    }
}
