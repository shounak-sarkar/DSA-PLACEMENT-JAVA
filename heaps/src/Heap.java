import java.util.Scanner;

public class Heap {

    int arr[];
    int size;
    public Heap(){
        arr=new int[100];
    }
    public Heap(int size) {
        arr = new int[size];
    }

    //utility
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void insert(int val) {
        size += 1;
        int index = size;
        arr[index] = val;
        while (index > 1) {
            int parent = index / 2;

            if (arr[parent] < arr[index]) {
                swap(arr,parent,index);
                index=parent;
            }else{ //reached correct node
                return ;
            }
        }
    }
    public static void heapify(int [] arr,int n , int i){
        int largest = i ;
        int left = 2 * i + 1;
        int right = 2*i + 2;

        if(left < n && arr[largest] < arr[left]){
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]){
            largest=right;
        }

        if(largest != i) //updated
        {
            swap(arr, largest , i);
            heapify(arr,n,largest);
        }
    }
    void delete(){
        if ( size == 0 ){
            System.out.println("Heap is Empty !!!");
            return;
        }
        //put last element to last index !!!
        arr[1] = arr[size];

        //remove last element
        size--;

        //take root to its correct position
        int i = 1;
        while( i < size ){
            int leftIndex = 2*i;
            int rightIndex = 2*i+1;

            if(leftIndex < size && arr[i] < arr[leftIndex]){
                swap(arr,i,leftIndex);
                i=leftIndex;
            }
            else if(rightIndex < size && arr[i] < arr[rightIndex]){
                swap(arr,i,rightIndex);
                i=rightIndex;
            }
            else { return ; }
        }

    }
    public static void printArr(int arr[]){
        for (int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void sort(int[] arr,int n){
        int size = n;
        while(size > 1){
            //step 1:swap
            Heap.swap(arr,size,1);
            size--;

            //step 2 : build heap using the elements
            Heap.heapify(arr,size,1);


        }
    }

    public void displayHeap(){
        for (int i = 1 ; i <= size ; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Heap heap=new Heap();

//        heap.insert(25);
//        heap.insert(62);
//        heap.insert(45);
//        heap.insert(75);
//        heap.insert(65);
//
//        heap.displayHeap();
//        heap.delete();
//        heap.displayHeap();

        int [] arr={-1,54,53,55,52,50};
        int n = arr.length;
        for (int i = n/2 ; i > 0 ; i--){
            heapify(arr,n,i);
        }
    }
}
