package basics;
public class reverseArray {
    public static void swap(int[] arr,int l , int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void reverseArrRecur(int[] arr,int l,int r){
        if(l>=r) return;
        swap(arr,l,r);
        reverseArrRecur(arr,l+1,r-1);
    }
    public static void printArr(int[] arr){
        // print the reverse array
        System.out.print("{ ");
        int j = 0;
        for (int i : arr ){
            System.out.print(i);
            if (j!=arr.length-1){
                System.out.print(",");
                j++;
            }

        }
        System.out.print(" }\n");
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Before Reverse");
        printArr(arr);
        reverseArrRecur(arr,0,arr.length-1);
        System.out.println("After Reverse");
        printArr(arr);


    }
}
