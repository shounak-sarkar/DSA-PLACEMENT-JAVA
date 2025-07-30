import arrays_easy.ArrayFns;
public class SORT_EASY {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
	    int i =0 , j = 0;
	    for (i = 0 ; i < n-1 ; i++)
	    {
            boolean isSwapped = false;
		    for (j = 0; j < n-i-1  ; j++)
            {
		    if (arr[j] > arr[j+1]) //compare adjacent elements and push larger to end
            {
			    swap(arr,i,j);
                isSwapped = true;
            }
            }
            if (!isSwapped) return;
        }
    }
    public static void SelectionSort(int arr[]){
        int n = arr.length , i = 0 , j = 0;
        for (i = 0 ; i < n-1 ; i++)
        {
            int mini=i;
            for ( j = i+1 ; j < n ;j++ )
            {
                if (arr[j] < arr[mini]) mini = j; 
            }
            swap (arr,i,mini);
            
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String args[]){
        int[] arr={23,13,41,5,6,1,23,12,112,54,};
        //int[] arr = {1,2,3,4,5};
        System.out.println("Array before sorting ");
        ArrayFns.printArray(arr);
        System.out.println("Array after sorting");
        //bubbleSort(arr);
        //SelectionSort(arr);
        insertionSort(arr);
        ArrayFns.printArray(arr);

    }
    
}
