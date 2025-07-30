package arrays_easy;
import java.util.Scanner;
public class largestelearray{
    //Brute method to find the largest element in array
    public static int largestBrute(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if  (arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = {11, 32, 43, 14, 25, 36, 47, 87, 90, 95};
        System.out.println("The Largest Element in an Array is "+largestBrute(arr));
    }
}