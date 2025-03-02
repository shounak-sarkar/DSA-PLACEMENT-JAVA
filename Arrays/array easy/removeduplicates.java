import java.util.Scanner;
import java.util.HashSet;
//return the number of unique elements in an array
public class removeduplicates {
    public static void removeduplicates(int arr[],int n){
        HashSet<Integer> set=new HashSet<>();
        for (int i=1;i<n;i++){
            set.add(arr[i]);
        }
        System.out.println("The number of unique elements : "+ set.size());
        System.out.println("The unique elements are : "+ set);
    }
    // public static void displayArray(int arr[]){
    //     System.out.print("\nArray Elements are {");
    //     for (var i : arr){
    //         System.out.print(i+" ");
    //     }
    //     System.out.print("}\n\n");
    // }

    public static void removeduplicates2(int arr[],int n){
        HashSet<Integer> set=new HashSet<>();
        for (int i=1;i<n;i++){
            set.add(arr[i]);
        }
        int index=0;
        for (int it : set ){
            arr[index]=it;
            index++;
        }

        //print the array 
        System.out.println("The New Array after removing duplicates is" );
        for (int e : arr){
            System.out.print(e+" ");
        }
    }
    
    public static void removeduplicatesTwoPointer(int arr[],int n){
        //keep a pointer at first 
        int i=0,j=1;
        while (j<n){
            if (arr[j]!=arr[i]){
                i=i+1;
                arr[i]=arr[j];
            }
            j++;
        }
        ArrayFns.printArray(arr);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = {13, 32, 90, 13, 25, 32, 47, 87, 90, 32};
        System.out.println("The OG Array after removing duplicates is" );
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println("");
        // removeduplicates(arr, arr.length);
        removeduplicates2(arr, arr.length);
        removeduplicatesTwoPointer(arr, arr.length);
    }
    
}
