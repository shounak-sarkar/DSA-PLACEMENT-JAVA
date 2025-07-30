package BasicSort;
import array.array;
public class Bubble {
    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr,int n)
    {
        for (int i = 0 ; i < n-1 ; i++)
        {
            for (int j=0 ; j < n-1 ; j++)
            {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 9, 1, 6, 2, 7};
        Bubble bubble = new Bubble();
        array a=new array();
        System.out.println("Before Sort");a.printArr(arr);
        bubble.bubbleSort(arr,arr.length);
        System.out.println("After Sort");a.printArr(arr);
    }
}
