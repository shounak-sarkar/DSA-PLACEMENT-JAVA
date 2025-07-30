package striverHeap;

public class HeapSort {
    //utility
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void heapify(int arr[], int n, int i) {
        // Find largest among root, left child and right child
        // 0 based indexing
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            swap(arr,i,largest);
            heapify(arr, n, largest);
        }
    }
    public static void sort(int[] arr,int n){
        int size = n;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        //extract elements from heap one by one
        for (int i = n-1 ; i>=0 ;i--){
            swap(arr,0,i); //SWAP the current root(largest) with the Leaf Node (last node)
            heapify(arr,i,0); //heapify
        }

    }

    public static void main(String[] args) {
        int [] arr= {-1,55,23,45,67,12,33}; //-1 since 1 based indexing hence 0th contains a dummy element
        printArr(arr);
        System.out.println("\nAfter Sorting !!! ");
        sort(arr,arr.length);

        printArr(arr);
    }

    public static void printArr(int arr[]){
        for (int a : arr){
            System.out.print(a+" ");
        }
    }

}
