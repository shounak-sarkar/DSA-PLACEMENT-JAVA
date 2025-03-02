import java.util.Scanner;

public class secondlargest{
    public static int secondlargestBetter(int arr[]){ 
        //complexity is O(2n) ~ O(n)
        int max=arr[0];
        //first pass to find the largest element
        for (int i=0;i<arr.length;i++){
            if  (arr[i] > max ){
                max = arr[i];
            }
        }
        //second pass to find the 2nd largest element
        int secondmax=-1;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > secondmax ) {
                if ( arr[i] != max){
                    secondmax=arr[i];
                }
            }
        }
        return secondmax;
    }

    // public static int secondoptimal(int arr[],int n ){
    //     int res=-1,largest = 0;
    //     for (int i = 1 ; i < n ; i++ ){
    //         if(arr[i]>arr[largest])
    //         {
    //             res=largest;
    //             largest=i;
    //         }
    //         else if(arr[i]!=arr[largest])
    //         {
    //             if(res == -1 || arr[i]>arr[res])
    //                 res = i;
    //         }
    //     }
    //     return res;
    // }

    public static int secondoptimal(int arr[],int n ){ //complexity is O(n)
        int largest=Integer.MIN_VALUE,second_largest = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ;i++ ){
            if (arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            //checking whether the current element is greater than second_largest but smaller than largest
            // when largest is already set.
            else if (arr[i] > second_largest && arr[i] != second_largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = {11, 32, 43, 14, 25, 36, 47, 87, 90, 95};
        System.out.println("The 2nd Largest Element in an Array is "+secondoptimal(arr, arr.length));
    }
}
