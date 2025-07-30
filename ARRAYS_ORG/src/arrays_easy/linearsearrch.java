package arrays_easy;
import java.util.Scanner;
import java.util.ArrayList;
public class linearsearrch {
    public static ArrayList<Integer> searchLin(int nums[],int key){
        ArrayList<Integer> res=new ArrayList<>();
        int pos=0;
        for (int i : nums){
            if (i == key) {
                res.add(pos);
            }
            pos++;
        }
        return res;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,2,3,4,6,71,1,23,45,67,8,123,234,1,566,1212,321,231};
        int n=1;
        ArrayList<Integer> res=new ArrayList<>();
        System.out.println("The elements are found at "+searchLin(nums,n)); 
    }
    
}
