public class HeapSort {
    public static void main(String[] args) {
        int [] arr= {-1,55,23,45,67,12,33}; //-1 since 1 based indexing hence 0th contains a dummy element
        Heap.printArr(arr);
        System.out.println("\nAfter Sorting !!! ");
        Heap.sort(arr,arr.length-1);

        Heap.printArr(arr);

    }
}
