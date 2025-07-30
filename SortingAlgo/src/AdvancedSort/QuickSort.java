package AdvancedSort;
import java.util.ArrayList;
import array.array;

public class QuickSort {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partitionedIndex(int [] arr , int start ,int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start ; j <=end-1;j++){
            if(arr[j] < pivot){  //move smaller than pivot elements to left
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,end);
        return i;
    }

    public void quickSort(int[] arr , int start ,int end){

        if(end<=start) return;

        int pivot=partitionedIndex(arr,start,end);
        quickSort(arr,start,pivot - 1);
        quickSort(arr,pivot+1,end);

    }




    public static void main(String[] args) {
        QuickSort m=new QuickSort();
        array Arr=new array();

        int[] arr={3,2,6,1,7,8,10,12};
        System.out.println("Before Sorting :: ");Arr.printArr(arr);
        m.quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting :: ");Arr.printArr(arr);
    }
}
