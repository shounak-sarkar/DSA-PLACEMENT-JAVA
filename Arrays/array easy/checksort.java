import java.util.*;
public class checksort {
    public static boolean check(int m[],int n){
        int i = 1;
        while(i<n){
            if (m[i] > m[i-1]){
                i++;    
            }
            else 
                return false;
        }
        return true;
    }
    
    public static void main(String args[])
    {
        int arr[] = {11, 32, 43, 14, 25, 36, 47, 87, 90, 95};
        int arr2[] = {1,2,3,4,5,6,7,8};
        int arr3[] = {2,3,4,5,6,8};

        if (check(arr3, arr3.length)){
            System.out.println("Yes Sorted !!! ");
        }
        else {
            System.out.println("Not Sorted !!! ");
        }

        if (check(arr, arr.length)){
            System.out.println("Yes Sorted !!! ");
        }
        else {
            System.out.println("Not Sorted !!! ");
        }

        if (check(arr2, arr2.length)){
            System.out.println("Yes Sorted !!! ");
        }
        else {
            System.out.println("Not Sorted !!! ");
        }

    }
    
}
